package Behavioral.TemplateMethod;

public class Client {
    public static void main(String[] args) {
        ReaderOfFiles pdfReader = new PDFExecute();
        ReaderOfFiles docReader = new DOCExecute();

        pdfReader.work();
        System.out.println("----------------------");
        docReader.work();
    }
}
