class A{
    public void show()
    {
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
    }




public class Methodoverriding {
    public static void main(String a[]){
        B obj = new B();
        obj.show();
        obj.config();
    }
}

