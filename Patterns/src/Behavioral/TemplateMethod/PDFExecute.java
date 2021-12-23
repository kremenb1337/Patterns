package Behavioral.TemplateMethod;

public class PDFExecute extends ReaderOfFiles{
    @Override
    public void executeFile() {
        System.out.println("Executing pdf file");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving pdf file");
    }
}
