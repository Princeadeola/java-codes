package Building_Blocks.ExplainSpecifiers;

public class FirstClass {
    protected String name = "John Doe";
    protected void run(){

    }

    public static void main(String[] args) {
        FirstClass mi = new FirstClass();
        mi.run();
        mi.name = "";
    }
}
