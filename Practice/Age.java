package Practice;

public class Age {
    public static void main(String[] args){
        int age = 2;
    
        if (age <= 0 && age <=2){
            System.out.println("infant");

        }
        else if (age <= 3 && age <=5){
            System.out.println("Toddler");

        }
        else if (age <= 6 && age <=12){
            System.out.println("Child");

        }
        else if (age <= 13 && age <=19){
            System.out.println("Teenager");

        }
        else {
            System.out.println("Adult");

        }


    }
    
}
