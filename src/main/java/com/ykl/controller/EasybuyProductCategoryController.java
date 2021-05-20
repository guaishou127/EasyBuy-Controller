package com.ykl.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ykl.entity.EasybuyProduct;
import com.ykl.entity.EasybuyProductCategory;
import com.ykl.pojo.RespBean;
import com.ykl.service.EasybuyProductCategoryService;
import com.ykl.service.EasybuyProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Api(tags = "EasybuyProductCategory")
@RequestMapping(value = "EasybuyProductCategory")
@RestController
/*跨域*/
@CrossOrigin
public class EasybuyProductCategoryController {

    @Autowired
    private EasybuyProductCategoryService easybuyProductCategoryService;
    @Autowired
    private EasybuyProductService easybuyProductService;
    @ApiOperation(value = "查询全部方法")
    @GetMapping(value = "/findType")
    public RespBean findByType(@RequestParam(value = "type")Integer type){
        List<EasybuyProductCategory> findType = easybuyProductCategoryService.findByType(type);
        for (EasybuyProductCategory e:findType) {
            List<EasybuyProductCategory> list = easybuyProductCategoryService.findparentId(e.getId());
            e.setZilei(list);
            for (EasybuyProductCategory e1:list) {

                List<EasybuyProductCategory> list1 = easybuyProductCategoryService.findparentId(e1.getId());
                e1.setZilei(list1);

            }
        }
        return RespBean.success("一级",findType);
    }



    @ApiOperation(value = "按categoryLevel1Id查询")
    @GetMapping(value = "/findcategoryLevel2Id")
    public RespBean findByType2(@RequestParam(value = "type")Integer type){
        List<EasybuyProductCategory> findType2 = easybuyProductCategoryService.findByType2(type);
        for (EasybuyProductCategory e:findType2) {
            List<EasybuyProductCategory> list=easybuyProductCategoryService.findparentId(e.getId());

            List<EasybuyProduct> list1 = easybuyProductService.findcategoryLevel1Id(e.getId());

            e.setLian(list1);
             e.setZilei(list);
            /*for (EasybuyProductCategory e1 :list) {


            }*/
        }

        return RespBean.success("成功",findType2);
    }


    @ApiOperation(value = "按findparentId查询")
    @GetMapping(value = "/findid")
    public RespBean findcategoryLevel2Id(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam(value = "id")Integer id){
        PageHelper.startPage(pageNum,5);
        List<EasybuyProduct> findcategoryLevel2Id = easybuyProductService.findcategoryLevel2Id(id);
        PageInfo<EasybuyProduct> empList = new PageInfo<EasybuyProduct>(findcategoryLevel2Id);
        return RespBean.success("查询成功",empList);
    }


}
