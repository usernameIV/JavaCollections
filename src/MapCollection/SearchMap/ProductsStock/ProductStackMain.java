package MapCollection.SearchMap.ProductsStock;

public class ProductStackMain {


    public static void main(String[] args) {

        ProductStack prd = new ProductStack();
        prd.displayProducts();
        prd.addProducts(1L, "Product A", 5.0, 10);
        prd.addProducts(2L, "Product B", 10.0, 5);
        prd.addProducts(3L, "Product C", 15.0, 2);

        prd.displayProducts();

        System.out.println();
        System.out.println("Valor total do estoque: R$" + prd.calculateTotalValue());
        System.out.println("Least expensive product: " + prd.getLeastExpensiveProduct());


    }





}
