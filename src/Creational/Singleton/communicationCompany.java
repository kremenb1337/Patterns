package Creational.Singleton;

public class communicationCompany {
    private static communicationCompany company;

    private communicationCompany(){}

    public static communicationCompany access() {
        if (company == null) { company = new communicationCompany(); }
        return company;
    }
}
