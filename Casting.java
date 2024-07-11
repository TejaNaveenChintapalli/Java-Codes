class A{
    public void show1(){
        System.out.println("in A Show");
    }

}
class B extends A{
    public void show2(){
        System.out.println("in B Show");
    }
}




public class Casting {
    public static void main(String[]args){
        A obj = (A) new A();
        obj.show1();

        B obj1 = (B) obj;
        obj.show2();
    }

    
}
