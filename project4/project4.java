import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type anything (type STOP to quit):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("STOP")) break;

            // Process input on the fly
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed: " + reversed.toUpperCase());
        }

        System.out.println("project 4 done, nice progress!");
    }
}
