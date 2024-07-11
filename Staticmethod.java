class Mobile{
    String brand;
    int price;
    String network;
    static String name;
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
public static void show1(Mobile obj1)
{
    System.out.println("in static method");
}



public class Staticmethod{
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smart phone"; 

         
       Mobile.show1(obj1);
      
    }
}

}
