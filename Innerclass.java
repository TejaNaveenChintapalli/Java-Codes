class A {
    int age;

    public void show(){
        System.out.println("in show");

    }

    static class B{
        public void config(){
            System.out.println("in config");
        }
    }
}




public class Innerclass {
    public static void main(String[] args){
        A obj = new A();
        obj.show();  

        A.B obj1 = new A.B();
        obj1.config();

    }


    
}
// if you want to create object of B you need object of A first
// show is non static method which means if you want to call show you need a object 
// if you want to create a object of inner class you need to first specify where it belongs to (which is A)  and then you need a object of inner class (which is B)
//can you make a class static?
//when you refer it to a static class you dont need object so basically you dont call it with the help of object you can directly refer with A.B
//you can only make inner class static 


