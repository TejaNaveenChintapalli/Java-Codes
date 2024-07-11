interface computer{
    void code();

}

class laptop implements computer{
    public void code(){
        System.out.println("fast coding");
    }
}

class desktop implements computer{
    public void code(){
        System.out.println("faster coding");
    }
}
class devloper {
    public void devapp(computer desk){
        desk.code();
    }
}




public class Interfaces {
    public static void main (String args[]){
        computer lap = new laptop();
        computer desk = new desktop();
        
        devloper teja = new devloper();
        teja.devapp(desk);

}
}













//by default every method in interface is public abstarct
//interface basically means its like a class where all the methods are by default public abstract
//