package Creational.FactoryMethod;

public abstract class officeHR {

     public void announcement() {
          System.out.println("We are hiring our new employees!");
          Employee employee = hire();
          employee.work();
     }

     public abstract Employee hire();
}
