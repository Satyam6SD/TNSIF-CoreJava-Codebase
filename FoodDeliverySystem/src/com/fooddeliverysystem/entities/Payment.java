package com.fooddeliverysystem.entities;

public class Payment 
{
	
	private int paymentId;
    private int orderId;
    private String method;
    private double amount;
    private boolean success;

    public Payment(int paymentId, int orderId, String method, double amount, boolean success) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.method = method;
        this.amount = amount;
        this.success = success;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getMethod() {
        return method;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", orderId=" + orderId +
                ", method='" + method + '\'' +
                ", amount=" + amount +
                ", success=" + success +
                '}';
    }

}
