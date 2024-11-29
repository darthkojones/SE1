package houseTemplate;

// concrete class that provides implementation for building a brick house
public class BrickHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("building brick walls");
    }

    @Override
    protected void buildRoof() {
        System.out.println("building concrete roof");
    }

    @Override
    protected void placeDoorsAndWindows() {
        System.out.println("placing steel doors and double-glazed windows");
    }
}