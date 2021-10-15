package com.softin.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public PaymentResponse.PaymentStatus makePayment(double amount){
        PaymentResponse paymentResponse = paymentGateway.resquestPayment(new PaymentRequest(amount));
        return paymentResponse.getPaymentStatus();
    }
}
