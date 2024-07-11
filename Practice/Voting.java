package Practice;
import java.util.Scanner;
public class Voting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = input.nextInt();
        input.close();

        if(age>=18){
            System.out.println("Eligible For Voting");
        }
        else{
            System.out.println("Not Eligible For Voting");
        }
    }
}
