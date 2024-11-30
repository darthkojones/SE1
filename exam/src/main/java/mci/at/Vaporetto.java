package mci.at;

public class Vaporetto implements Transport {
    @Override
    public void bookRide() {
        System.out.println("vaporetto booked, enjoy your complimentary sea sickness");
    }

    @Override
    public double getPrice(){
        return 112; //i've been to venice those things r exxxxxxxxxxxpensive af, dont even get me started on the gongolas
    }
}