package Creational.Builder;

public interface HouseBuilder {
    HometownHouseBuilder hasPool(boolean pool);
    HometownHouseBuilder hasGarden(boolean garden);
    HometownHouseBuilder amountOfRooms(int amountOfRooms);
    HometownHouseBuilder hasGarage(boolean garage);
    House getResult();
}
