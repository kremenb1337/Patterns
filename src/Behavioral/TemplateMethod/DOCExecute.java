package Behavioral.TemplateMethod;

public class DOCExecute extends ReaderOfFiles{
    @Override
    public void executeFile() {
        System.out.println("Executing doc file");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving doc file");
    }
}
