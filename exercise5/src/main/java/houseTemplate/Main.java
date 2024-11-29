package houseTemplate;

public class Main {
    public static void main(String[] args) {
        // building a wooden house
        House woodenHouse = new WoodenHouse();
        System.out.println("making a Wooden House:");
        woodenHouse.buildHouse();

        // building a brick house
        House brickHouse = new BrickHouse();
        System.out.println("making a Brick House:");
        brickHouse.buildHouse();

        // building a glass house
        House glassHouse = new GlassHouse();
        System.out.println("making a Glass House:");
        glassHouse.buildHouse();
    }
}
