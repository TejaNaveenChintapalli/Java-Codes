package Pattern;
import java.util.Scanner;
public class Pattren2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side n ");
        int n = input.nextInt();
        input.close();
    for (int i=1; i<=n; i++){

        for (int j=1; j<= n-i; j++){
            System.out.print("  ");
        }
    for(int k=1; k<=i; k++) {
        if (i==n || k==1 || k==i){
        System.out.print("* ");
    }else{
        System.out.print("  ");
    }
}    
        System.out.println();
}
    }
    }
