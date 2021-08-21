package com.devnaldo.checkoutecommerceapi.config;

import com.devnaldo.checkoutecommerceapi.streaming.CheckoutCreatedSource;
import com.devnaldo.checkoutecommerceapi.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
