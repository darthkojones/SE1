package mci.at;

public class BankTransferPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer, very old school, the Rothschild's prolly got a % out of it too");
    }
    @Override
    public String toString() {
    return "Bank Transfer";
}

}