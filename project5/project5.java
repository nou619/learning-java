import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type anything (type STOP to quit):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("STOP")) break;

            // Detect if it's an integer
            try {
                int num = Integer.parseInt(input);
                System.out.println("You typed a NUMBER: " + num);
                continue;
            } catch (NumberFormatException oops) {
                // Not an integer, continue
            }

            // Detect if it's a boolean
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                boolean b = Boolean.parseBoolean(input);
                System.out.println("You typed a BOOLEAN: " + b);
                continue;
            }

            // Otherwise, treat as text
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("You typed TEXT, reversed: " + reversed.toUpperCase());
        }

        System.out.println("project 5 done, WELL DONE!");// me hyping myself up
    }
}
