package mci.at;

public class UFO implements Transport {
    @Override
    public void bookRide() {
        System.out.println("\n z00m z00m an UFO is coming to pick you up. your pilot's name is Zorp the Gronkulon"); // quick 20 minute adventure
    }

    @Override
    public double getPrice(){
        return 69420.0; //nice
    }
}
