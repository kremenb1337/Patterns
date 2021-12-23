package Creational.FactoryMethod;

public class Resolve {
    static officeHR hiringHR;
    public static void main(String[] args) throws Exception{
        preference("Spider");
        hiringHR.announcement();
    }
    private static void preference(String s) throws Exception{
        if (s.equals("Spider")) {
            hiringHR = new spiderHR();
        } else if (s.equals("Data scientist")) {
            hiringHR = new dataScientistHR();
        } else {
            throw new Exception("We can't hire you on that position");
        }
    }
}