package com.devnaldo.payment_ecommerce_api.service;

import com.devnaldo.payment_ecommerce_api.entity.PaymentEntity;
import com.devnaldo.payment_ecommerce_api.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent) {
        final PaymentEntity paymentEntity = PaymentEntity.builder()
                .checkoutCode(checkoutCreatedEvent.getCheckoutCode())
                .code(UUID.randomUUID().toString())
                .build();
        paymentRepository.save(paymentEntity);
        return Optional.of(paymentEntity);
    }
}}
