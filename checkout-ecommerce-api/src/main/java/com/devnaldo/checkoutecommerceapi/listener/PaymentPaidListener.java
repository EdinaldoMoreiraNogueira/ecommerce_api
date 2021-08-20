package com.devnaldo.checkoutecommerceapi.listener;


import com.devnaldo.checkoutecommerceapi.entity.CheckoutEntity;
import com.devnaldo.checkoutecommerceapi.service.CheckoutService;
import com.devnaldo.checkoutecommerceapi.streaming.PaymentPaidSink;
import com.devnaldo.checkoutecommerceapi.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
