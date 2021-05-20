package com.ykl.controller;

import com.ykl.entity.EasybuyUser;
import com.ykl.pojo.EmptyUtils;
import com.ykl.pojo.RespBean;
import com.ykl.pojo.SecurityUtils;
import com.ykl.service.EasybuyUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "EasybuyUserController")
@RequestMapping(value = "EasybuyUser")
@RestController
/*跨域*/
@CrossOrigin
public class EasybuyUserController {
    @Autowired
    private EasybuyUserService easybuyUserService;

    @ApiOperation(value = "登陆方法")
    @PostMapping(value = "/login")
    public RespBean login(@RequestParam(value = "loginName") String loginName, @RequestParam(value = "password") String password) {
        EasybuyUser login = easybuyUserService.login(loginName);


        if (EmptyUtils.isEmpty(login)) {
            return RespBean.error("用户不存在",1);
        } else {
            if (login.getPassword().equals(SecurityUtils.md5Hex(password))) {
                //登陆成功
                return RespBean.success("登录成功", login);
            } else {
                return RespBean.error("密码错误",2);
            }

        }
    }


    @ApiOperation(value = "注册方法")
    @PostMapping(value = "/insert")
    public RespBean insert(EasybuyUser easybuyUser){
        String password=easybuyUser.getPassword();
        easybuyUser.setPassword(SecurityUtils.md5Hex(password));
        int insert = easybuyUserService.insert(easybuyUser);
        if (insert>0){
            return RespBean.success("添加成功",insert);
        }else {
            return RespBean.error("添加失败");
        }

    }
}