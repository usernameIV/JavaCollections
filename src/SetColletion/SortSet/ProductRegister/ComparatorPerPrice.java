package SetColletion.SortSet.ProductRegister;

import java.util.Comparator;

class ComparatorPerPrice implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
