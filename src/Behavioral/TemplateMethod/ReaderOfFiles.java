package Behavioral.TemplateMethod;

public abstract class ReaderOfFiles {

    public void findPath() {
        System.out.println("Finding a path to file");
    }
    public void notifyUser() {
        System.out.println("File has been executed");
    }

    public void work() {
        findPath();
        executeFile();
        saveFile();
        notifyUser();
    }

    public abstract void executeFile();
    public abstract void saveFile();

}
