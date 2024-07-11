class Student{
        String name;
        int marks;
        int rollno;
}


public class Array2 {
     
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "Nandamuri";
        s1.rollno = 1;
        s1.marks= 24;

        Student s2 = new Student();
        s2.name = "Taraka";
        s2.rollno = 2;
        s2.marks = 24;

        Student s3 = new Student();
        s3.name ="RamaRao";
        s3.rollno = 3;
        s3.marks = 24;

    Student Students[] = new Student[3];
    Students[0]=s1;
    Students[1]=s2;
    Students[2]=s3;

        //for (int i=0; i<Students.length; i++){
            //System.out.println(Students[i].rollno + " . " + Students[i].name + " : " + Students[i].marks);

            for (Student stud : Students){
                System.out.println(stud.name+" : " + stud.marks);
            }
        }
    }

