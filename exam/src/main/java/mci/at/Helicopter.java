package mci.at;

public class Helicopter implements Transport {
    @Override
    public void bookRide() {
        System.out.println("helicopter ride booked. rest in peace Kobe");
    }

    @Override
    public double getPrice(){
        return 420.0;
    }
}
