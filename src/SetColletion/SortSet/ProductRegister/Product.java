package SetColletion.SortSet.ProductRegister;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private String name;
    private long id;
    private double price;
    private int qnt;

    public Product(String name, long id, double price, int qnt) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qnt = qnt;
    }

    @Override
    public int compareTo(Product p) {
        return name.compareTo(p.getName());
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getId() == product.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return '\n'
            + "Product" + '\n'
            +"name - " + name + '\n'
            +"id - " + id + '\n'
            +"price - " + price + '\n'
            +"qnt - " + qnt + '\n';
    }

}
