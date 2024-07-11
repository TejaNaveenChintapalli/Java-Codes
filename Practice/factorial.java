package Practice;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the value N");
    int N = input.nextInt();
    input.close();

    int factorial = 1;
    for (int i=1; i <= N; i++){
        factorial *= i;
    }

System.out.println("The factorial of "+ N + " is: "+ factorial);

    }  
}











