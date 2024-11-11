package at.mci.adrianpetre.VendingMachine;


    public class CoffeeFactory implements BeverageFactory {

        @Override
        public Beverage createHotBeverage() {
            Coffee coffee = new Coffee();
            coffee.setTemperature(90); // make it hawwwwt
            coffee.setSize(250); //  size in ml
            coffee.setCream(false);
            coffee.setMilk(false);
            coffee.setSugar(false);
            return coffee;
        }
    
        @Override
        public Beverage createWarmBeverage() {
            Coffee coffee = new Coffee();
            coffee.setTemperature(60); // warm and gentle just like your soul
            coffee.setSize(250); // size in ml
            coffee.setCream(false);
            coffee.setMilk(false);
            coffee.setSugar(true); // also sweet just like you
            return coffee;
        }
    
        @Override
        public Beverage createColdBeverage() {
            Coffee coffee = new Coffee();
            coffee.setTemperature(5); // frozen like your ex's heart
            coffee.setSize(500); // big like her butt!
            coffee.setCream(false);
            coffee.setMilk(true); // and milky like her boobs
            coffee.setSugar(false);
            return coffee;
        }
    }
    


