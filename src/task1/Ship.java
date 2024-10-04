package task1;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by water using a ship.");
    }
}
