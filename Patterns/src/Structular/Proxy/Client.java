package Structular.Proxy;

public class Client {
    public static void main(String[] args) {
        CheckTheDatabase check = new ProxyDataBase("one");
        check.check("one");
    }
}
