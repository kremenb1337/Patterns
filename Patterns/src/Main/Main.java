package Main;

import Creational.Builder.HometownHouseBuilder;
import Creational.Builder.House;
import Creational.Builder.HouseBuilder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new HometownHouseBuilder();
        House house = builder.hasGarage(true).amountOfRooms(3).hasPool(true).getResult();
        house.displayHouse();
    }
}
