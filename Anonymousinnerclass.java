class A{
        public void show(){
            System.out.println("in B show");
        }
    }



public class Anonymousinnerclass {
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();


    }
    
}


// what if we konw that the class B is only used for that particular use
//in that scenario no need to create a new class
//you can create a object of A you can directly write the implementation before the semicolon
//that is called a inner class 
//as we are not giving any class keyword (since it dont hava a name) that is called as a Anonymous inner class



//can we use anonymous inner class & abstract class & method at the same time?
//**yes (in this case we will create the object of the anonymous inner class)
//we will use this mostly in interfaces.
//if you want to implement interface or abstarct class only once then you can use anonymous inner class.
