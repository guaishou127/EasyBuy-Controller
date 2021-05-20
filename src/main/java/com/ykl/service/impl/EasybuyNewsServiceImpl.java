package com.ykl.service.impl;

import com.ykl.entity.EasybuyNews;
import com.ykl.mapper.EasybuyNewsMapper;
import com.ykl.service.EasybuyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EasybuyNewsServiceImpl implements EasybuyNewsService {
    @Autowired
    private EasybuyNewsMapper easybuyNewsMapper;

    @Override
    public List<EasybuyNews> findLimit() {
        return easybuyNewsMapper.findLimit();
    }

    @Override
    public EasybuyNews findByid(Integer id) {
        return easybuyNewsMapper.findByid(id);
    }
}
