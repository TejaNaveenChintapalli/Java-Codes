package Pattern;
import java.util.Scanner;
public class Pattren3 {

    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println("enter the height n ");
    int n = input.nextInt();
    input.close();
    int flag= 1;
    for (int i=1; i<=n; i++){
        for (int j=n-i; j>0; j--){
            System.out.print(" ");
        } //empty spaces
        for(int k=1;k<=2*i-1;k++)
        {
            if(flag==1)
            {
                System.out.print("*");
                flag=0;
            }
            else
            {
                System.out.print(" ");
                flag=1;
            }
        }
        flag=1;
        System.out.println();
    }
}
}
