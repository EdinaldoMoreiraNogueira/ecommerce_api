package com.devnaldo.payment_ecommerce_api.service;


import com.devnaldo.payment_ecommerce_api.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}