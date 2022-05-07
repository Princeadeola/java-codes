package Enumes;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer name = new StringBuffer("John Doe ");

        int namelength = name.length();

        int namecapacity = name.capacity();

        System.out.println("Length of String:  " + namelength);
        System.out.println("Capacity of String:  " + namecapacity);
        name.append("is a java developer");
        System.out.println(name);
        System.out.println("Length of String:  " + namelength);
        System.out.println("Capacity of String:  " + namecapacity);




    }





}
