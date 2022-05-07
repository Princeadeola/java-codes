package Conditional_Construct;

public class If_Else_If_Statement {
    public static void main(String[] args) {
        int age = 18;
        String male_gender = "male";
        String female_gender = "female";
        if (age < 18 && male_gender == "male") {
            System.out.println("female");

        } else if (age < 18 && female_gender == "female") {
            System.out.println("You are a girl");
        } else if (age < 18 || male_gender == "boy") {
            System.out.println("Small boy");
        } else {
            System.out.println("That is good");
        }

    }

}

