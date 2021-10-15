package com.softin.payments;

public class PaymentResponse {

    enum PaymentStatus{
        OK, PENDIENTE, EROOR
    }

    private PaymentStatus paymentStatus;

    public PaymentResponse(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
