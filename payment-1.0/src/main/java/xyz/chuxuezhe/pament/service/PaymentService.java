package xyz.chuxuezhe.pament.service;

import xyz.chuxuezhe.commons.entities.payment.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
