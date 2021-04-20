package com.lhb.springcloud.dao;

import com.lhb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: TODO
 * @Author: haibo.li
 * @Date: 2021/4/20 15:50
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
