package com.ykl.service;

import com.ykl.entity.EasybuyUser;

public interface EasybuyUserService {
    EasybuyUser login(String loginName);
    int insert(EasybuyUser easybuyUser);
}
