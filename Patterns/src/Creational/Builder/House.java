package Creational.Builder;

public class House {
    private int amountOfRooms;
    private boolean garden;
    private boolean garage;
    private boolean pool;

    public void setAmountOfRooms(int amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void displayHouse() {
        System.out.println("Amount of rooms: " + amountOfRooms);
        System.out.println((garden ? "Does" : "Doesn't") + " have garden");
        System.out.println((garage ? "Does" : "Doesn't") + " have garage");
        System.out.println((pool ? "Does" : "Doesn't") + " have pool");
    }
}
