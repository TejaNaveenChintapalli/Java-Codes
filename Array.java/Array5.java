public class Array5 {
    public static void main(String[] args) {
        int elements [] = {2,3,5,7,11};
        int count = 0;
        {
            for(int i=0; i< elements.length; i++){
                if(elements[i] % 1 == 0 && (elements[i] % elements[i]) == 0 ){
                    count++;
                }

        }
        }
System.out.println(count);
    }
    
}
