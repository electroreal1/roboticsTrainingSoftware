import java.util.ArrayList;

public class Cart {
    public ArrayList<Product> listOfProducts;

    public Cart() {
        this.listOfProducts = new ArrayList<>();
    }

    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void addProduct(Product product) {
        listOfProducts.add(product);
    }
}
