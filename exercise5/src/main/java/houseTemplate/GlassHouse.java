package houseTemplate;

// concrete class that provides implementation for building a glass house
public class GlassHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("building glass walls");
    }

    @Override
    protected void buildRoof() {
        System.out.println("building glass roof");
    }

    @Override
    protected void placeDoorsAndWindows() {
        System.out.println("placing sliding glass doors and large windows");
    }
}
