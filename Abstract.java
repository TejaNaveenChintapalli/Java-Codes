abstract class car{

    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("play music");

    }

}

class Benz extends car{
    public void fly(){
        System.out.println("Flying");
    }
    public void drive(){
        System.out.println("Driving");

    }
}




public class Abstract {
    public static void main(String[] args){
        car obj = new Benz();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
    
}
