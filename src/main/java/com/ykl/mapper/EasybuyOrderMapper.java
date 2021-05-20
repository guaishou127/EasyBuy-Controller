package com.ykl.mapper;

import com.ykl.entity.EasybuyOrder;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ykl.entity.EasybuyProduct;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyOrderMapper继承基类
 */

public interface EasybuyOrderMapper extends MyBatisBaseDao<EasybuyOrder, Integer> {

}