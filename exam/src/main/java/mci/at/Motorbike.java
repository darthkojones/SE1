package mci.at;

public class Motorbike implements Transport {
    @Override
    public void bookRide() {
        System.out.println("electric Vespa motorbike booked. hey it's cheap but it'll get you there"); //do they even have vespas in jakarta?
    }

    @Override
    public double getPrice(){
        return 35.0; //
    }
}