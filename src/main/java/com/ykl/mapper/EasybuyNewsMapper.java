package com.ykl.mapper;

import com.ykl.entity.EasybuyNews;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyNewsMapper继承基类
 */

public interface EasybuyNewsMapper extends MyBatisBaseDao<EasybuyNews, Integer> {

    List<EasybuyNews> findLimit();
    EasybuyNews findByid(@Param("id")Integer id);
}