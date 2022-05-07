package Operators.Logical_Operator;

public class Basic_Operator {
    public static void main(String[] args) {

        String name = "John";
        int age = 18;

        if (name == "John" && age == 18){
            System.out.println("Welcome on board John, You are now ready to leave Nigeria");
        }
        if (name == "John" || age == 17){
            System.out.println("If you are wrong, You are staying");
        }
    }
}
