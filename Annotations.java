class A{
    public void shows(){
        System.out.println("in a show");
        }
}


class B extends A{
    @Override
    public void show(){
        System.out.println("in b show");
    }

}




public class Annotations {
    public static void main(String[] args){
        B obj = new B();
        obj.shows();
    }
}
