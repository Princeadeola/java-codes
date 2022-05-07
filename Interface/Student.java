package Interface;

public class Student extends NIIT implements Software,Classes{
    @Override
    public void course() {
        System.out.println("Java Developer");
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.course();
        stu.softwareCourse();
    }


    @Override
    public void name() {
        System.out.println("john");
    }

    @Override
    public void number() {

    }
}
