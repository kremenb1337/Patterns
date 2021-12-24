package Structular.Proxy;

public class ProxyDataBase implements CheckTheDatabase{

    private String s;
    private RealDataBase realDataBase;

    public ProxyDataBase(String s) {
        this.s = s;
    }

    @Override
    public void check(String s) {
            realDataBase = new RealDataBase();
            realDataBase.check(s.toLowerCase());
    }
}
