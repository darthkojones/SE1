package mci.at;

public class Taxi implements Transport {
    @Override
    public void bookRide() {
        System.out.println("\n a Ferrari taxi has been booked"); // we ridin'in 'rrari's
    }

    @Override
    public double getPrice(){
        return 69.0; //nice
    }
}
