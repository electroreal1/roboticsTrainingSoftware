import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome!");
        System.out.println("What would you like to categorize?");

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter item " + (i + 1) + " name: ");
            String name = input.nextLine();

            System.out.print("Enter price for " + name + ": ");
            int price = input.nextInt();
            input.nextLine();

            System.out.print("Enter code at checkout for " + name + ": ");
            int codeAtCheckout = input.nextInt();
            input.nextLine();

            System.out.print("Enter urgency for " + name + ": ");
            char urgency = input.next().charAt(0);
            input.nextLine();

            Product newProduct = new Product(name, price, codeAtCheckout, urgency);
            cart.addProduct(newProduct);
        }

        System.out.println("\nYour full categorized list:");
        int counter = 1;
        for (Product product : cart.listOfProducts) {
            System.out.println(counter + ". " + product.nameOfProduct + " -$ " + product.price);
            counter++;
        }

        input.close();
    }
}
