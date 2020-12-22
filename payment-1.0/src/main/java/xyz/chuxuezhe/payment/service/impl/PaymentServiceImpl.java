package xyz.chuxuezhe.payment.service.impl;

import org.springframework.stereotype.Service;
import xyz.chuxuezhe.commons.entities.payment.Payment;
import xyz.chuxuezhe.payment.mapper.PaymentMapper;
import xyz.chuxuezhe.payment.service.PaymentService;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
