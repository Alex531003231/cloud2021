package com.lhb.springcloud.service;

import com.lhb.springcloud.entities.CommonResult;
import com.lhb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 支付service
 * @Author: haibo.li
 * @Date: 2021/4/20 15:57
 */
public interface PaymentService {

    public CommonResult<Integer> create(Payment payment);

    public CommonResult<Payment> getPaymentById(@Param("id") Long id);
}
