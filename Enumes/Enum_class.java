package Enumes;

public enum Enum_class {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;


    void run() {
        switch (this) {
            case MONDAY:
                System.out.println("No java class");
                break;
            case TUESDAY:
                System.out.println("First Java class of the week");
                break;
            case WEDNESDAY:
                System.out.println("Assignment from java class");
                break;
            case THURSDAY:
                System.out.println("Second Java class of the week");
                break;
            default:
                System.out.println("Please, give us many assignment for the weekend");
                break;


        }

    }

    public static void main(String[] args) {
        //Enum_class.THURSDAY.run();
        //System.out.println(Enum_class.MONDAY.hashCode());
        System.out.println(Enum_class.MONDAY.compareTo(Enum_class.MONDAY));


    }
}
