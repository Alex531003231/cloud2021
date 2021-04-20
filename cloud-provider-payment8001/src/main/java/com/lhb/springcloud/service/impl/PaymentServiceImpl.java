package com.lhb.springcloud.service.impl;

import com.lhb.springcloud.dao.PaymentDao;
import com.lhb.springcloud.entities.Payment;
import com.lhb.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: haibo.li
 * @Date: 2021/4/20 15:58
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
