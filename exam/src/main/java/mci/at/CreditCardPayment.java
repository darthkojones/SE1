package mci.at;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card, glad you didn't forget your pin code");
    }

    @Override
    public String toString() {
    return "Credit Card";
}

}