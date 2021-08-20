package com.devnaldo.checkoutecommerceapi.service;



import com.devnaldo.checkoutecommerceapi.entity.CheckoutEntity;
import com.devnaldo.checkoutecommerceapi.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
