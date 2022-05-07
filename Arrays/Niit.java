package Arrays;

public class Niit {
    String Student_name ;
    int Student_age;

    public Niit(String name, int age) {
        Student_name = name;
        Student_age = age;
    }
    public Niit(String Student_name){
        Student_name = Student_name;
    }
    public Niit(){


    }
     public void run(){
         System.out.println(Student_name);
         System.out.println(Student_age);

    }

     public static void main(String[] args) {
       // Niit Student = new Niit("Lola",19);
       // Student.run();
        Niit Student = new Niit("john",20);


    }
}
