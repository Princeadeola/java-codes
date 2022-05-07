package Arrays;

public class One_Dimensional_Array {
    public static void main(String[] args) {
//        String[] phones = {"iphone", "Samsung", "Red magic", "Google Pixel", "Oppo"};
//        for (int i = 0; i < phones.length; i++)
//        System.out.println(phones[i]);

        int num[] = new int[5];
        num[0] = 6;
        num[1] = 5;
        num[2] = 7;
        num[3] = 9;
        num[4] = 0;

        // num (0) // element == 0
        for (int element : num){
            System.out.println(element);
        }
    }
}
