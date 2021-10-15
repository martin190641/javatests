package com.softin.payments;

public interface PaymentGateway {
    PaymentResponse resquestPayment(PaymentRequest request);

}
