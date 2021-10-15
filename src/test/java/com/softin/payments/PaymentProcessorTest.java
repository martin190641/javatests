package com.softin.payments;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setUp(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }
    @Test
    public void payment_is_correct() {
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertEquals(paymentProcessor.makePayment(1000), PaymentResponse.PaymentStatus.OK);
    }

    @Test
    public void payment_is_on_pendent() {
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.PENDIENTE));

        assertEquals(paymentProcessor.makePayment(1000), PaymentResponse.PaymentStatus.PENDIENTE);
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.EROOR));

        assertEquals(paymentProcessor.makePayment(1000), PaymentResponse.PaymentStatus.EROOR);
    }
}