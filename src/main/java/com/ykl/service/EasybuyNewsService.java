package com.ykl.service;

import com.ykl.entity.EasybuyNews;

import java.util.List;

public interface EasybuyNewsService {
    //查询
    List<EasybuyNews> findLimit();

    EasybuyNews findByid(Integer id);
}
