import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum (type 0 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;   
            sum += num;            
        }

        System.out.println("Total sum: " + sum);
    }
}
