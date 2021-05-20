package com.ykl.mapper;

import com.ykl.entity.EasybuyUserAddress;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

/**
 * EasybuyUserAddressMapper继承基类
 */
@Repository
public interface EasybuyUserAddressMapper extends MyBatisBaseDao<EasybuyUserAddress, Integer> {
}