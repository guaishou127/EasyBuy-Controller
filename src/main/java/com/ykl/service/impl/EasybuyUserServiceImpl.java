package com.ykl.service.impl;

import com.ykl.entity.EasybuyUser;
import com.ykl.mapper.EasybuyUserMapper;
import com.ykl.service.EasybuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EasybuyUserServiceImpl implements EasybuyUserService {
    @Autowired
    private EasybuyUserMapper easybuyUserMapper;

    @Override
    public EasybuyUser login(String loginName) {
        return easybuyUserMapper.login(loginName);
    }

    @Override
    public int insert(EasybuyUser easybuyUser) {
        return easybuyUserMapper.insert(easybuyUser);
    }
}
