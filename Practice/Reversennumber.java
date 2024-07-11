package Practice;

public class Reversennumber {
    public static void main(String[] args){
        int reversed = 0;
        int number = 1234;
        while(number != 0){
            int digit =  number%10;
            reversed = reversed*10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
    }
    
}
