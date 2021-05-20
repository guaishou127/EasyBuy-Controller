package com.ykl.service.impl;

import com.ykl.entity.EasybuyNews;
import com.ykl.entity.EasybuyProduct;
import com.ykl.entity.EasybuyProductCategory;
import com.ykl.mapper.EasybuyProductMapper;
import com.ykl.service.EasybuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EasybuyProductServiceImpl implements EasybuyProductService {
    @Autowired
    private EasybuyProductMapper  easybuyProductMapper;



    @Override
    public EasybuyProduct findByid(Integer id) {
        return easybuyProductMapper.findByid(id);
    }

    @Override
    public List<EasybuyProduct> findcategoryLevel1Id(Integer categoryLevel1Id) {

        return easybuyProductMapper.findcategoryLevel1Id(categoryLevel1Id);
    }
    @Override
    public List<EasybuyProduct> findcategoryLevel2Id(Integer categoryLevel2Id) {
        return easybuyProductMapper.findcategoryLevel2Id(categoryLevel2Id);
    }

    @Override
    public List<EasybuyProduct> findall() {
        return easybuyProductMapper.findall();
    }

    @Override
    public List<EasybuyProduct> secrchname(String name) {
        return easybuyProductMapper.secrchname(name);
    }
}
