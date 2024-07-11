class A{
public void show(){
    System.out.println("in A Show");
}
}
class B extends A{

   public void show(){
    System.out.println("in B Show");
   }
}
class C extends A{
public void show(){
    System.out.println("in C Show");
}

}
 




public class Dmd {
    public static void main(String[] args){
        A obj = new A();   // reference of a super class and object of a sub class
        obj.show();

        obj = new B();    // Type is still A but the object is B that's why it will call the B show
        obj.show();
    
        obj = new C();
        obj.show();         // so same object obj  is behaving differently with different objects => run time   polymorphism
    
    }
}

