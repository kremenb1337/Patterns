package Structular.Adapter;

public class Client {
    public static void main(String[] args) {
        dollarCounter dollar = new Dollar();
        euroCounter euro = new Euro();
        euroCounter adapter = new moneyAdapter(dollar);

        Shop shop = new Shop();

        shop.buySomething(euro);
        shop.buySomething(adapter);
    }
}
