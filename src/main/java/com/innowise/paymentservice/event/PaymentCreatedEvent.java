package com.innowise.paymentservice.event;

import com.innowise.paymentservice.enums.PaymentStatus;

public record PaymentCreatedEvent(
        String orderId,
        PaymentStatus status
) {}
