package Arrays;

public class Assignment_On_Three_Dimensional_Array {
    public static void main(String[] args) {
        int fiveD[][][];
        fiveD = new int[2][2][3];
        fiveD[0][0][1] = 0;
        fiveD[0][1][0] = 1;
        fiveD[0][1][1] = 2;
        fiveD[1][0][0] = 3;
        fiveD[1][0][1] = 4;
        fiveD[1][1][0] = 5;
        fiveD[1][1][1] = 6;
        fiveD[0][0][2] = 7;
        fiveD[0][0][0] = 8;
        fiveD[0][0][0] = 9;
        for (int i=0; i<fiveD.length; i++){
            for (int j = 0; j < fiveD[i].length; j++) {
                for (int k = 0; k < fiveD[i][j].length; k++) {
                    System.out.print(fiveD[i][j][k] + " ");

                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
