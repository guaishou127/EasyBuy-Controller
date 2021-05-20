package com.ykl.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ykl.entity.EasybuyProduct;
import com.ykl.pojo.RespBean;
import com.ykl.service.EasybuyProductCategoryService;
import com.ykl.service.EasybuyProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "EasybuyProductController")
@RequestMapping(value = "EasybuyProduct")
@RestController
/*跨域*/
@CrossOrigin
public class EasybuyProductController {
    @Autowired
    private EasybuyProductService easybuyProductService;
    private EasybuyProductCategoryService easybuyProductCategoryService;

    @ApiOperation(value = "查询全部方法")
    @GetMapping(value = "/findByid")
    public RespBean findByid(@RequestParam(value = "id")Integer id){
            EasybuyProduct findByid = easybuyProductService.findByid(id);

            return RespBean.success("查询成功",findByid);


    }
    @ApiOperation(value = "搜索")
    @GetMapping(value = "/secrchname")
    public RespBean secrchname(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam(value = "name")String name){
        PageHelper.startPage(pageNum,5);
        List<EasybuyProduct> secrchname = easybuyProductService.secrchname(name);
        PageInfo<EasybuyProduct> searchList = new PageInfo<EasybuyProduct>(secrchname);
        return RespBean.success("查询成功",searchList);
    }

    @ApiOperation(value = "搜索")
    @GetMapping(value = "/findall")
    public RespBean findall(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum){
        PageHelper.startPage(pageNum,5);
        List<EasybuyProduct> findall = easybuyProductService.findall();
        PageInfo<EasybuyProduct> findalllist = new PageInfo<EasybuyProduct>(findall);
        return RespBean.success("查询成功",findalllist);


    }
}


