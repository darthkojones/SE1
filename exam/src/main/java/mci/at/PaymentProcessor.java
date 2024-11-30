package mci.at;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void executePayment(double amount) {
        paymentMethod.pay(amount);
    }
}
