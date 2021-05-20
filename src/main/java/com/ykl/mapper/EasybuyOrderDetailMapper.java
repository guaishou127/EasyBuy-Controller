package com.ykl.mapper;

import com.ykl.entity.EasybuyOrderDetail;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

/**
 * EasybuyOrderDetailMapper继承基类
 */
@Repository
public interface EasybuyOrderDetailMapper extends MyBatisBaseDao<EasybuyOrderDetail, Integer> {
}