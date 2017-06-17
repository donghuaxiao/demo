package com.ericsson.request;

/**
 * Created by edoaxio on 6/17/2017.
 */
public class PaymentOrderQueryParam extends Page {
    private String paymentOrderId;

    private String orderId;

    public String getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(String paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
