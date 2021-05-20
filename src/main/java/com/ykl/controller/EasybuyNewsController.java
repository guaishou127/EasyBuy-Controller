package com.ykl.controller;


import com.ykl.entity.EasybuyNews;
import com.ykl.pojo.RespBean;
import com.ykl.service.EasybuyNewsService;
import com.ykl.service.EasybuyProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "EasybuyNewsController")
@RequestMapping(value = "EasybuyNews")
@RestController
/*跨域*/
@CrossOrigin
public class EasybuyNewsController {
    @Autowired
    private EasybuyNewsService easybuyNewsService;

    @ApiOperation(value = "查询全部方法")
    @GetMapping(value = "findAll")
    public RespBean findLimit() {
        List<EasybuyNews> findLimit = easybuyNewsService.findLimit();
        return RespBean.success("查询成功",findLimit);
    }

    @ApiOperation(value = "id查询新闻方法")
    @GetMapping(value = "findNewByid")
    public RespBean findByid(@RequestParam("id")Integer id){
        EasybuyNews byid = easybuyNewsService.findByid(id);
        return RespBean.success("查询成功",byid);
    }
}
