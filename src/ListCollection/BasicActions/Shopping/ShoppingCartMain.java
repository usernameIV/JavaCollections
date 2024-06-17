package ListCollection.BasicActions.Shopping;

import ListCollection.BasicActions.Shopping.Item;
import ListCollection.BasicActions.Shopping.ShoppingCart;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart<Item> cart = new ShoppingCart<>();
        cart.addItem("Pão de caixa", 6.50, 2);
        cart.addItem("Caixa de ovo", 18.50, 1);
        cart.addItem("Bolinho de queijo", 2.50, 5);
        cart.addItem("Frango", 25.99, 1);

        cart.showItems();
        cart.calculateTotalValue();

        cart.removeItem("Caixa de ovo");
        System.out.println();
        System.out.println("Value after removal of an item ↓");
        cart.calculateTotalValue();



    }
}
