package com.ykl.service.impl;

import com.ykl.entity.EasybuyProductCategory;
import com.ykl.mapper.EasybuyProductCategoryMapper;
import com.ykl.service.EasybuyProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasybuyProductCategoryServiceImpl implements EasybuyProductCategoryService {
    @Autowired
    private EasybuyProductCategoryMapper easybuyProductCategoryMapper;

    @Override
    public List<EasybuyProductCategory> findByType(Integer type) {
        return easybuyProductCategoryMapper.findByType(type);
    }

    @Override
    public List<EasybuyProductCategory> findByType2(Integer type) {
        return easybuyProductCategoryMapper.findByType2(type);
    }

    @Override
    public List<EasybuyProductCategory> findparentId(Integer parentid) {
        return easybuyProductCategoryMapper.findparentId(parentid);
    }


}
