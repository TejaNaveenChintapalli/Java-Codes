package Practice;
public class divison {
    public static void main(String[] args) {
       int count = 0;
        for(int i=1; i<=50; i++)

        {
            if(i%2 !=0 && i%3 == 0){
                count++;

            }

        }
        System.out.println(count);
    }
}