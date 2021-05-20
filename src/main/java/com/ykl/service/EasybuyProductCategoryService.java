package com.ykl.service;

import com.ykl.entity.EasybuyProductCategory;

import java.util.List;

public interface EasybuyProductCategoryService {
//查询商品分类列表
    /*一二三级查询*/
    List<EasybuyProductCategory>findByType(Integer type);
    List<EasybuyProductCategory>findByType2(Integer type);

    /*type传到parentid查询*/
    List<EasybuyProductCategory>findparentId(Integer parentid);

}
