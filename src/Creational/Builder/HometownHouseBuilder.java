package Creational.Builder;

public class HometownHouseBuilder implements HouseBuilder{

    House house = new House();

    public HometownHouseBuilder hasPool(boolean pool) {
        house.setPool(pool);
        return this;
    }

    public HometownHouseBuilder hasGarden(boolean garden) {
        house.setGarden(garden);
        return this;
    }

    public HometownHouseBuilder amountOfRooms(int amountOfRooms) {
        house.setAmountOfRooms(amountOfRooms);
        return this;
    }

    public HometownHouseBuilder hasGarage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    public House getResult() {
        return house;
    }
}
