package Structular.Adapter;

public class moneyAdapter implements euroCounter{
    dollarCounter dollar;

    public moneyAdapter(dollarCounter dollar) {
        this.dollar = dollar;
    }

    @Override
    public double getMoney() {
        return dollar.getMoney() * 0.88;
    }
}
