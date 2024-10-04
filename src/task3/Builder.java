package task3;

public class Builder {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }
}


