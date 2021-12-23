package Creational.Singleton;

public class communicationCompany {
    private static communicationCompany company;
    private int secretDeactivationCode = 12321;

    public static communicationCompany access() {
        if (company == null) { company = new communicationCompany(); }
        return company;
    }

    public void getSecretDeactivationCode() {
        System.out.println(secretDeactivationCode);
    }

    public void setSecretDeactivationCode(int newCode) {
        secretDeactivationCode = newCode;
    }
}
