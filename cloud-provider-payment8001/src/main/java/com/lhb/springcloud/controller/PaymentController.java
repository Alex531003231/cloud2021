package com.lhb.springcloud.controller;

import com.lhb.springcloud.entities.CommonResult;
import com.lhb.springcloud.entities.Payment;
import com.lhb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 支付controller
 * @Author: haibo.li
 * @Date: 2021/4/20 16:02
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;


    /**
     * @Description: 新增支付信息
     * @Author: haibo.li
     * @Param payment:
     * @return: CommonResult
     * @Date: 2021/4/20 17:05
     **/
    @PostMapping("create")
    public CommonResult<Integer> create(Payment payment) {
        return paymentService.create(payment);

    }

    /**
     * @Description: 根据id查询支付信息
     * @Author: haibo.li
     * @Param id:
     * @return: CommonResult
     * @Date: 2021/4/20 17:05
     **/
    @GetMapping("get/{id}")
    public CommonResult<Payment> get(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

}
