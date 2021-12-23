package Creational.AbstractFactory;

public class UserPreference {
    public SchoolStore store;
    public UserPreference(String preference) throws Exception {
        switch (preference) {
            case "Math":
                store = new MathStore();
                break;
            case "Physics":
                store = new PhysicsStore();
                break;
            case "Biology":
                store = new BiologyStore();
                break;
            default:
            throw new Exception("Not a class");
        }
    }
}
