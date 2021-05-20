package com.ykl.mapper;

import com.ykl.entity.EasybuyProductCategory;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyProductCategoryMapper继承基类
 */

public interface EasybuyProductCategoryMapper extends MyBatisBaseDao<EasybuyProductCategory, Integer> {
	List<EasybuyProductCategory> findByType(@Param("type") Integer type);
    List<EasybuyProductCategory> findparentId(@Param("parentid") Integer parentid);


    List<EasybuyProductCategory> findByType2(@Param("type") Integer type);
}