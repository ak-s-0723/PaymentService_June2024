package org.example.paymentservice_july2024.services;

import org.example.paymentservice_july2024.paymentgateway.PaymentGateway;
import org.example.paymentservice_july2024.paymentgateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String getPaymentLink(Long amount,String orderId,String phoneNumber,String name) {
        PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getOptimalPaymentGateway();
        return paymentGateway.getPaymentLink(amount,orderId,phoneNumber,name);
    }
}
