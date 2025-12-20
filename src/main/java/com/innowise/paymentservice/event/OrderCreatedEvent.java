package com.innowise.paymentservice.event;

public record OrderCreatedEvent(
        String orderId,
        String userId,
        Long paymentAmount
) {
}
