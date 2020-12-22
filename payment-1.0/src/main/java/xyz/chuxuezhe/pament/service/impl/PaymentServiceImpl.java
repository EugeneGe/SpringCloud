package xyz.chuxuezhe.pament.service.impl;

import org.springframework.stereotype.Service;
import xyz.chuxuezhe.commons.entities.payment.Payment;
import xyz.chuxuezhe.pament.dao.PaymentDao;
import xyz.chuxuezhe.pament.service.PaymentService;

import javax.annotation.Resource;


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
