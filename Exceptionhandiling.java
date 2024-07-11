


public class Exceptionhandiling {
    public static void main(String[] args){
        int i = 5;
        double j = 0;
        int nums[] = new int[5];
        String str = null;
        try
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {

            System.out.println("something wnet wrong.." + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit..");
        }
        catch(Exception e){
            System.out.println("asdf" + e);
        }



        System.out.println(j);
        System.out.println("Bye");
    }
    
}
