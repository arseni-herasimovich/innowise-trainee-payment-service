package com.innowise.paymentservice.event.publisher;

import com.innowise.paymentservice.event.PaymentCreatedEvent;

public interface PaymentEventPublisher {
    void publishPaymentCreated(PaymentCreatedEvent event);
}
