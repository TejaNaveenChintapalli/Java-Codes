package Practice;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int a = input.nextInt();
        input.close();
        if (a<=100 && a>=90){
            System.out.println("Grade A");
        }
        else if(a<=89 && a>=80){
            System.out.println("Grade B");
        }
        else if(a<=79 && a>=70){
            System.out.println("Grade C");
        }
        else if(a<=69 && a>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade E");
        }
    }
    
}
//How can you make the above code more efficient?