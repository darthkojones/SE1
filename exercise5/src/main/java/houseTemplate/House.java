package houseTemplate;

// abstract class that defines the template method for building a house
public abstract class House {
    // template method defining the order of construction steps
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        placeDoorsAndWindows();
        System.out.println("job done\n");
    }

    // method for building foundation
    private void buildFoundation() {
        System.out.println("start with the floors");
    }

    // abstract methods that must be implemented by subclasses
    protected abstract void buildWalls();
    protected abstract void buildRoof();
    protected abstract void placeDoorsAndWindows();
}