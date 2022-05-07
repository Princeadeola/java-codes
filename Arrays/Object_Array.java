package Arrays;

public class Object_Array {
    public static void main(String[] args) {
        Niit[] Student = new Niit[3];
        Student[0] = new Niit("john" , 20);
        Student[1] = new Niit("Lola", 12);
        Student[2] = new Niit("james", 35);
        for (Niit i: Student) {
            System.out.println(i.Student_age);

        }


    }
}
