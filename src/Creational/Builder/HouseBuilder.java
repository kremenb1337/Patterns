package Creational.Builder;

public interface HouseBuilder {
    HouseBuilder hasPool(boolean pool);
    HouseBuilder hasGarden(boolean garden);
    HouseBuilder amountOfRooms(int amountOfRooms);
    HouseBuilder hasGarage(boolean garage);
    House getResult();
}
