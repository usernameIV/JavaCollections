package SetColletion.SortSet.ProductRegister;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegister {
    private Set<Product> products;

    public ProductRegister() {
        this.products = new HashSet<>();
    }

    public void addProduct(String name, long id, double price, int qnt) {
        products.add(new Product(name, id, price, qnt));
    }

    public Set<Product> displayProductsByName() {
        Set<Product> productsByName = new TreeSet<>(products);
        return productsByName;
    }

    public Set<Product> displayProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorPerPrice());
        productsByPrice.addAll(products);
        return productsByPrice;
    }
}
