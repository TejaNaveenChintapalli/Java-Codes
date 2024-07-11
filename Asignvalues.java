class A{
    public int[] num(){
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        return a;
    }
}


public class Asignvalues{
    public static void main(String[] args){
        A objA = new A();
        int[] a = objA.num();
        
        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
}