package com.devnaldo.payment_ecommerce_api.repository;

import com.devnaldo.payment_ecommerce_api.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}