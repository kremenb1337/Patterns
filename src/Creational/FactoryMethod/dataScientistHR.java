package Creational.FactoryMethod;

public class dataScientistHR extends officeHR{
    @Override
    public Employee hire() {
        return new dataScientist();
    }
}
