public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1234", 12);
        Item item2 = new Item("12345", 13);
        Item item3 = new Item("12349", 16);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);

        PaiementStrategy creditCard = new CreditCardStrategy(
                "zouhaier",
                "22334444477777",
                "122",
                "12/12/2010"
                );
        PaiementStrategy paypal = new PaypalStrategy("zouhaire@gmail.com","122djdjd");

        shoppingCart.pay(creditCard);
        shoppingCart.pay(paypal);
    }
}
