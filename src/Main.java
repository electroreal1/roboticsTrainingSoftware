import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] list = new String[10];
        Double[] prices =  new Double[10];

        Scanner input = new Scanner(System.in);

        System.out.printf("Hello and welcome!%n");
        System.out.println("What would you like to categorize?");

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter item " + (i + 1) + " name: ");
            list[i] = input.nextLine();

            System.out.print("Enter price for " + list[i] + ": ");
            prices[i] = input.nextDouble();
            input.nextLine();
        }

        System.out.println("\nYour full categorized list:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + list[i] + " - $" + prices[i]);
        }

        input.close();
    }
}
