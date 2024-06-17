package SetColletion.SortSet.ProductRegister;

public class ProductRegisterMain {

    public static void main(String[] args) {

        ProductRegister prd = new ProductRegister();

        prd.addProduct("Product 1", 1, 50d, 5);
        prd.addProduct("Product 0", 2, 20d, 10);
        prd.addProduct("Product 2", 2, 10d, 2);
        prd.addProduct("Product 3", 9, 30d, 3);

        /*
        prd.addProduct(name, id, price, qnt);
        */

        System.out.println(prd.displayProductsByName());
        //product 2 won't be displayed cuz id matches another

        System.out.println();
        System.out.println("Products ordered by price: ");
        System.out.println(prd.displayProductsByPrice());

    }
}
