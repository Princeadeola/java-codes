package Inheritance;

public class Father extends GrandFather {

    @Override
    public void house() {
        super.house();
        System.out.println("This is the father's house");
    }

    public static void main(String[] args) {
        Father run = new Father();
        run.house();
    }
}
