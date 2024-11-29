package houseTemplate;

// concrete class that provides implementation for building a wooden house
public class WoodenHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("building wooden walls");
    }

    @Override
    protected void buildRoof() {
        System.out.println("building wooden roof");
    }

    @Override
    protected void placeDoorsAndWindows() {
        System.out.println("placing wooden doors and glass windows");
    }
}