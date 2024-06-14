package ListCollection.BasicActions.Shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart <T> {

    private List<Item> itemsList;

    public ShoppingCart() {
        this.itemsList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        itemsList.add(new Item(name, price, quantity));
    }
    public void removeItem(String name) {
        List<Item> toRemoveItem = new ArrayList<>();
        for (Item item : itemsList) {
            if (item.getName().equalsIgnoreCase(name)) {
                toRemoveItem.add(item);
            }
        }
        itemsList.removeAll(toRemoveItem);
    }
    public void calculateTotalValue() {
        double uniqueItems = 0;
        double manyItems = 0;
        double sumItems;
        for (Item i : itemsList) {
            double result = i.getPrice() * i.getQuantity();
            if (i.getQuantity() > 1) {
                uniqueItems += result;
            }
            if (i.getQuantity() < 2) {
                manyItems += result;
            }
        }
        sumItems = uniqueItems + manyItems;
        System.out.printf("Total value in the cart is: %.2f", sumItems);
    }
    public void showItems() {
        for (Item i : itemsList) {
            double result = i.getPrice() * i.getQuantity();
            System.out.println("Name: "+ i.getName() + '\n'
                    + "Price: R$" + i.getPrice() + " - " + result +'\n'
                    + "Quantity: "+ i.getQuantity()+ '\n');
        }
    }


}
