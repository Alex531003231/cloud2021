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

    /**
     * @Description: 新增
     * @Author: haibo.li
     * @Param payment:
     * @return: int
     * @Date: 2021/4/20 17:19
     **/
    public int create(Payment payment);

    /**
     * @Description: 根据id查询
     * @Author: haibo.li
     * @Param id:
     * @return: Payment
     * @Date: 2021/4/20 17:19
     **/
    public Payment getPaymentById(@Param("id") Long id);
}
