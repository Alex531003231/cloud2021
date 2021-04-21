package com.lhb.springcloud.service.impl;

import com.lhb.springcloud.dao.PaymentDao;
import com.lhb.springcloud.entities.CommonResult;
import com.lhb.springcloud.entities.Payment;
import com.lhb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @Description: 支付serviceImpl
 * @Author: haibo.li
 * @Date: 2021/4/20 15:58
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Value("${server.port}")
    private String serverPort;

    /**
     * @Description: 新增支付信息
     * @Author: haibo.li
     * @Param payment:
     * @return: CommonResult<Integer>
     * @Date: 2021/4/20 17:18
     **/
    @Override
    public CommonResult<Integer> create(Payment payment) {
        CommonResult<Integer> returnMsg = new CommonResult<>();
        int result = paymentDao.create(payment);
        if (result > 0) {
            log.info("******插入成功，哈哈哈哈：" + result);
            returnMsg.setCode(200);
            returnMsg.setMessage("插入数据库成功,serverPort: " + serverPort);
            returnMsg.setData(result);
        } else {
            returnMsg.setCode(500);
            returnMsg.setMessage("插入数据库失败,serverPort: " + serverPort);
            returnMsg.setData(result);
        }
        return returnMsg;
    }

    /**
     * @Description: 根据id查询支付信息
     * @Author: haibo.li
     * @Param id:
     * @return: CommonResult<Payment>
     * @Date: 2021/4/20 17:18
     **/
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        CommonResult<Payment> returnMsg = new CommonResult<>();
        Payment payment = paymentDao.getPaymentById(id);
        if (ObjectUtils.isEmpty(payment)) {
            returnMsg.setCode(200);
            returnMsg.setMessage("查询成功,但结果为空,哈哈哈,serverPort: " + serverPort);
            returnMsg.setData(payment);
        } else {
            returnMsg.setCode(200);
            returnMsg.setMessage("查询成功，serverPort: " + serverPort);
            returnMsg.setData(payment);
        }
        return returnMsg;
    }
}
