package com.ykl.mapper;

import com.ykl.entity.EasybuyUser;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

/**
 * EasybuyUserMapper继承基类
 */

public interface EasybuyUserMapper extends MyBatisBaseDao<EasybuyUser, Integer> {

    EasybuyUser login(@Param("loginName") String loginName);
    int insert(EasybuyUser easybuyUser);
}