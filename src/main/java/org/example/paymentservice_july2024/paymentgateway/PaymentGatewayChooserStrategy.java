package org.example.paymentservice_july2024.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {
    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGateway getOptimalPaymentGateway() {
        //Add logic for random num generation and call stripe if num is even else call razorpay
        return stripePaymentGateway;
    }
}
