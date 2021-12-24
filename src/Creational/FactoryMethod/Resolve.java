package Creational.FactoryMethod;

public class Resolve {

    public static void main(String[] args) throws Exception{
        officeHR hiringHR =  preference("Spider");
        hiringHR.announcement();
    }
    private static officeHR preference(String s) throws Exception{
        if (s.equals("Spider")) {
            return new spiderHR();
        } else if (s.equals("Data scientist")) {
            return new dataScientistHR();
        } else {
            throw new Exception("We can't hire you on that position");
        }
    }
}