package at.mci.adrianpetre.VendingMachine;

/*
 * renamed to Beverage to reduce confusion and not associate with previous exercise
 * 
 * this is the interface!!
 */
public interface class BeverageFactory {

    //refactor the code below
    abstract void createHotBeverage();
    abstract void createWarmBeverage();
    abstract void createColdBeverage();

    //then create the classes that implement the bev fac
    // such as class coffeefactory implements beverage factory 
    // tea, what else

}
