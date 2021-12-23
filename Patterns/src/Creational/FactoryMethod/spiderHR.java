package Creational.FactoryMethod;

public class spiderHR extends officeHR{
    @Override
    public Employee hire() {
        return new Spider();
    }
}
