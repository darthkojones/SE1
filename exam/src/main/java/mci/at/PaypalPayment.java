package mci.at;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " through PayPayl, back in the 2000s you would've made daddy Elon proud");
    }

    @Override
    public String toString() {
    return "PayPal";
}

}
