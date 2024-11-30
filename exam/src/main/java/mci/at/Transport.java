package mci.at;

// the general interface to be implemented by the rides
public interface Transport {
    void bookRide();
    //wanan add some prices
    double getPrice(); //because i want each ride to have a diff price
}
