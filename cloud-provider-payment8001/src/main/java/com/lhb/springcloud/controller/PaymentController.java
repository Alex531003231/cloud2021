package com.lhb.springcloud.controller;

import com.lhb.springcloud.entities.CommonResult;
import com.lhb.springcloud.entities.Payment;
import com.lhb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: haibo.li
 * @Date: 2021/4/20 16:02
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果："+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,result);
        }else {
            return new CommonResult(500,"插入数据库失败",null);
        }
    }


    @GetMapping("get/{id}")
    public CommonResult get(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (ObjectUtils.isEmpty(payment)){
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }else {
            return new CommonResult(200,"查询成功,serverPort: "+serverPort,payment);
        }
    }

}
