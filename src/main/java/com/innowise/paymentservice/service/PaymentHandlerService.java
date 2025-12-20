package com.innowise.paymentservice.service;

import com.innowise.paymentservice.dto.PaymentRequest;
import com.innowise.paymentservice.enums.PaymentStatus;

public interface PaymentHandlerService {
    PaymentStatus handlePayment(PaymentRequest paymentCompleted);
}
