package Structular.Proxy;

public class RealDataBase implements CheckTheDatabase{

    @Override
    public void check(String s) {
        switch (s) {
            case "one":
                System.out.println("You typed in \"1\"");
                break;
            case "two":
                System.out.println("You typed in \"2\"");
                break;
            case "zero":
                System.out.println("You typed in \"3\"");
                break;
            default:
                System.out.println("Your number is not in database");
        }
    }
}
