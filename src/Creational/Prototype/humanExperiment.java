package Creational.Prototype;

public class humanExperiment implements cloningDevice{
    public int height;
    public String name;
    public double iq;

    public humanExperiment(int height, String name, double iq) {
        this.height = height;
        this.name = name;
        this.iq = iq;
    }

    public humanExperiment cloning() {
        return new humanExperiment(height, name, iq);
    }
}
