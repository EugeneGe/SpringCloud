package xyz.chuxuezhe.payment.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.chuxuezhe.commons.entities.payment.Payment;

@Mapper
public interface PaymentMapper {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
