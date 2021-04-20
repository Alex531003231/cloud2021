package com.lhb.springcloud.service;

import com.lhb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: TODO
 * @Author: haibo.li
 * @Date: 2021/4/20 15:57
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
