public class Array4 {
    public static void main(String[] args){
        int numbers[] = {4444,5,6,78};
        int greatest = numbers[0];
        for (int i=1; i<numbers.length; i++){
            if (numbers[i] > greatest){
                greatest = numbers[i];
            }  


        }
System.out.println(greatest);
    }
}
