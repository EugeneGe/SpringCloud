package xyz.chuxuezhe.pament.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.chuxuezhe.commons.entities.payment.Payment;

@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
