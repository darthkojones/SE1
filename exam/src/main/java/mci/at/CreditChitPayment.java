package mci.at;

public class CreditChitPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using a credit chit. how very star wars of you!");
    }

    @Override
    public String toString() {
    return "credit chit";
}

}