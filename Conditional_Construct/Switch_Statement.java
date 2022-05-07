package Conditional_Construct;

public class Switch_Statement {
    public static void main(String[] args) {
        int age = 0;
        int age2 = 15;

        String result = age < age2 ? "age is greater" : "age is lesser";
        System.out.println(result);
//        if (age == 15) {
//            System.out.println("You are still an under age to drive a car");
//        }else if (age == 18){
//            System.out.println("Happy birthday, you can now drive a car");
//        }else if (age == 20){
//            System.out.println("Wow, you are really growing");
//        }else {
//            System.out.println("Nope, can't find your age in the database");
//        }

        switch (age){
            case 15:
            case 16:
            case 11:
                System.out.println("You are still an under age to drive a car");
                break;
            case 18:
                System.out.println("Happy birthday, you can now drive a car");
                break;
            case 20:
                System.out.println("Wow, you are really growing");
                break;
            default:
                if (age < 18){
                    System.out.println("Nope, can't find your age in the database");
                }if (age > 18 && age < 84){
                    System.out.println("yap, can't find your age in the database");
            }
        }


    }
}
