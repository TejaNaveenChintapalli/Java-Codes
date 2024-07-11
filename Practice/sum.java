package Practice;
import java.util.Scanner;
public class sum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        System.out.println("Enter the value of b");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
       
        int sum = a + b;
        {
        System.out.println(sum);
        }
    }

    
}
