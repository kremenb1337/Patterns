package Structular.Adapter;

public class Shop {
    public void buySomething(euroCounter euro) {
        if (euro.getMoney() >= 30) {
            System.out.println("Thank you for your purchase");
        } else {
            System.out.println("You don't have enough money");
        }
    }
}
