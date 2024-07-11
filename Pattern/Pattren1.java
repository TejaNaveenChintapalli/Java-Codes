package Pattern;
import java.util.Scanner;
public class Pattren1 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Lenght of the side n");
    int n = input.nextInt();
    input.close();

    
     for(int i=1; i<=n; i++) {
        for(int j=1; j<=n ;j++){
         
            if (i==1 || i==n || j==1 || j==n ){ 
                 System.out.print("* ");  
                  } else {
                        System.out.print("  ");
                    }
                 } 
    System.out.println();
    
    }
  }
}
