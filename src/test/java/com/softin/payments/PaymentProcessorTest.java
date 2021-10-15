package com.softin.payments;


import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
public class PaymentProcessorTest {
    @Test
    public void payment_is_correct() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        assertEquals(paymentProcessor.makePayment(1000), PaymentResponse.PaymentStatus.OK);
    }

    @Test
    public void payment_is_on_pendent() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.PENDIENTE));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        assertEquals(paymentProcessor.makePayment(1000), PaymentResponse.PaymentStatus.PENDIENTE);
    }

    @Test
    public void payment_is_wrong() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.EROOR));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        assertEquals(paymentProcessor.makePayment(1000), PaymentResponse.PaymentStatus.EROOR);

    }
}