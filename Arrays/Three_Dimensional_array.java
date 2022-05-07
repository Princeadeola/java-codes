package Arrays;

public class Three_Dimensional_array {
    public static void main(String[] args) {
        int threeD[][][];
        threeD = new int[2][3][2];
        threeD[0][0][0] = 0;
        threeD[0][0][1] = 1;
        threeD[0][1][0] = 2;
        threeD[0][1][1] = 3;
        threeD[0][2][0] = 4;
        threeD[0][2][1] = 5;
        threeD[1][0][0] = 6;
        threeD[1][0][1] = 7;
        threeD[1][1][0] = 8;
        threeD[1][1][1] = 9;
        threeD[1][2][0] = 4;
        threeD[1][2][1] = 6;
        threeD[0][1][1] = 0;
        for (int i=0; i<threeD.length; i++){
            for (int j = 0; j <threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length ; k++) {
                    System.out.print(threeD[i][j][k] + " ");

                }
                System.out.println();

            }
            System.out.println();
        }

       // System.out.println(threeD[0][1][1] );

    }
}
