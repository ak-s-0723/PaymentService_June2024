package org.example.paymentservice_july2024.paymentgateway;

public interface PaymentGateway {

    String getPaymentLink(Long amount,String orderId,String phoneNumber,String name);
}
