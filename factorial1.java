import java.util.Scanner;
public class factorial1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value");
        int N = input.nextInt();
        input.close();

        {
            int a = 1;
            for (int i=1; i<=N ; i++)
            a = i*a;
            System.out.println("The result value of "+ N + " is " + a);

        }


    }


    
}
