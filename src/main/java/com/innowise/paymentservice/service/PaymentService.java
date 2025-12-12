package com.innowise.paymentservice.service;

import com.innowise.paymentservice.dto.PaymentResponse;
import com.innowise.paymentservice.event.OrderCreatedEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.Instant;
import java.util.List;

public interface PaymentService {

    Page<PaymentResponse> search(Pageable pageable, String orderId, String userId, List<String> statuses);

    Long getTotalAmountOfPaidInPeriod(Instant from, Instant to);

    void create(OrderCreatedEvent event);
}
