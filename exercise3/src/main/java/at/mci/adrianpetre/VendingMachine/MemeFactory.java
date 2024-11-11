package at.mci.adrianpetre.VendingMachine;
public class MemeFactory implements BeverageFactory {

    
        @Override
        public Beverage createHotBeverage() {
            MemeDrink meme = new MemeDrink();
            meme.setTemperature(90); // make it hawwwwt
            meme.setSize(249); //  size in ml
            meme.setCream(false);
            meme.setMilk(false);
            meme.setSugar(false);
            return meme;
        }
    
        @Override
        public Beverage createWarmBeverage() {
            MemeDrink meme = new MemeDrink();
            meme.setTemperature(60); // warm and gentle just like your soul
            meme.setSize(250); // size in ml
            meme.setCream(false);
            meme.setMilk(false);
            meme.setSugar(true); // also sweet just like you
            return meme;
        }
    
        @Override
        public Beverage createColdBeverage() {
            MemeDrink meme = new MemeDrink();
            meme.setTemperature(5); // frozen like your ex's heart
            meme.setSize(500); // big like her butt!
            meme.setCream(false);
            meme.setMilk(true); // and milky like her boobs
            meme.setSugar(false);
            return meme;
        }

}
