package MapCollection.SearchMap.ProductsStock;

import java.util.HashMap;
import java.util.Map;

public class ProductStack {


    Map<Long, Product> stock;

    public ProductStack() {
        this.stock = new HashMap<>();
    }

    public void addProducts(long id, String name, double ovo, int quantity) {
        stock.put(id, new Product(name, ovo, quantity));
    }
    public void displayProducts() {
        if (!stock.isEmpty()) {
            System.out.println(stock);
        }
        else {
            System.out.println("Map is empty");
        }
    }
    public double calculateTotalValue() {
        double stockTotalValue = 0d;
        if(!stock.isEmpty()) {
            for (Product prd : stock.values()) {
                stockTotalValue += prd.getQuantity() * prd.getPrice();
            }
        }
        else {
            System.out.println("Map is empty");
        }
        return stockTotalValue;
    }
    public Product getMostExpensiveProduct () {
        Product mostExpensiveProduct = null;
        double higherValue = Double.MIN_VALUE;
        if (!stock.isEmpty()) {
            for (Product prd : stock.values()) {
                if (prd.getPrice() > higherValue) {
                    mostExpensiveProduct = prd;
                }
            }
       }
        else {
            System.out.println("Map is empty");
        }
        return mostExpensiveProduct;
    }
    public Product getLeastExpensiveProduct () {
        Product leastExpensiveProduct = null;
        double smallestValue = Double.MAX_VALUE;
        if (!stock.isEmpty()) {
            for (Product prd : stock.values()) {
                if (prd.getPrice() < smallestValue) {
                    leastExpensiveProduct = prd;
                    smallestValue = prd.getPrice();
                }
            }
        }
        else {
            System.out.println("Map is empty");
        }
        return leastExpensiveProduct;
    }
    public Product getStockTotalValue () {
        Product stockTotalValue = null;
        double greaterValue = 0d;
        if (!stock.isEmpty()) {
            for (Map.Entry<Long, Product> entry : stock.entrySet()) {
                double productValueInStock = entry.getValue().getPrice() * entry.getValue().getQuantity();
                if (productValueInStock > greaterValue) {
                    greaterValue = productValueInStock;
                    stockTotalValue = entry.getValue();
                }
            }
        }
        return stockTotalValue;
    }


}
