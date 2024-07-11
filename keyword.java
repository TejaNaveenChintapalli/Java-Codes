class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class keyword{
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smart phone"; 

         
        obj1.show();


    }

}