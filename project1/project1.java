import java.util.Scanner;
public class project1{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter a :");
        String a =scanner.nextLine();
        System.out.println("argument 1:"+args[0]);
        System.out.print("value of a :"+ a);
        scanner.close();
    }
}