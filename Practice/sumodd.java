package Practice;
import java.util.Scanner;
public class sumodd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = input.nextInt();
        input.close();

        {
            int sum = 0;
            for(int i = 1; i<=value; i+=2)
            {
                sum = sum + i;
            }
            System.out.println(sum);
        }

    }

    
}
