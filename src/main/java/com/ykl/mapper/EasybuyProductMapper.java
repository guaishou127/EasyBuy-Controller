package com.ykl.mapper;

import com.ykl.entity.EasybuyProduct;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ykl.entity.EasybuyProductCategory;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyProductMapper继承基类
 */

public interface EasybuyProductMapper extends MyBatisBaseDao<EasybuyProduct, Integer> {
    EasybuyProduct findByid(@Param("id")Integer id);
    List<EasybuyProduct> findcategoryLevel1Id(@Param("categoryLevel1Id")Integer categoryLevel1Id);
    List<EasybuyProduct> findcategoryLevel2Id(@Param("categoryLevel2Id")Integer categoryLevel2Id);
    List<EasybuyProduct> findall();
    List<EasybuyProduct> secrchname(@Param("name")String name);

}