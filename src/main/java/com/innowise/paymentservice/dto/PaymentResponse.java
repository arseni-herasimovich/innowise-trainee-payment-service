package com.innowise.paymentservice.dto;

import com.innowise.paymentservice.enums.PaymentStatus;

import java.time.Instant;
import java.util.UUID;

public record PaymentResponse(
        UUID id,
        String orderId,
        String userId,
        PaymentStatus status,
        Instant timestamp,
        Long paymentAmount
) {
}
