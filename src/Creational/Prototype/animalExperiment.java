package Creational.Prototype;

public class animalExperiment implements cloningDevice{
    private String name;
    private int age;
    private String habitat;

    public animalExperiment(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    @Override
    public animalExperiment cloning() {
        return new animalExperiment(name, age, habitat);
    }
}
