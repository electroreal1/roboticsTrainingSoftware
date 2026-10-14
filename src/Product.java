public class Product {
    public String nameOfProduct;
    public int price;
    public int codeAtCheckout;

    /*
    H - high
    M - medium
    L - low
     */
    public char urgency;

    public Product(String nameOfProduct, int price, int codeAtCheckout, char urgency) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.codeAtCheckout = codeAtCheckout;
        this.urgency = urgency;
    }
}
