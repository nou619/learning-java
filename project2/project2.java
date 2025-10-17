import java.util.Scanner;
public class project2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you got? ");
        int n = sc.nextInt();

        int[] nums = new int[n]; 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int num : nums) {
            System.out.println(num);
        }
    }