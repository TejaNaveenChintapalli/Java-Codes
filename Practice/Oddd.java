package Practice;
public class Oddd{
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                count++;
            }
        }

        System.out.println("The count of odd numbers divisible by 3 between 1 and 50 is: " + count);
    }
}
    

