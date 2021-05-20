package com.ykl.service;

import com.ykl.entity.EasybuyProduct;

import java.util.List;

public interface EasybuyProductService {
    EasybuyProduct findByid(Integer id);

    List<EasybuyProduct> findcategoryLevel1Id(Integer categoryLevel1Id);

    List<EasybuyProduct> findcategoryLevel2Id(Integer categoryLevel2Id);

    List<EasybuyProduct> findall();
    /*搜索*/
    List<EasybuyProduct> secrchname(String name);
}