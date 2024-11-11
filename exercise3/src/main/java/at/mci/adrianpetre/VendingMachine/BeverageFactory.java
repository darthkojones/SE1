package at.mci.adrianpetre.VendingMachine;

/*
 * renamed to Beverage to reduce confusion and not associate with previous exercise
 * 
 * this is the factory!!
 */
public interface  BeverageFactory {

    //let the confusion ensue!
    
    Beverage createHotBeverage();
    Beverage createWarmBeverage();
    Beverage createColdBeverage();
    


}
