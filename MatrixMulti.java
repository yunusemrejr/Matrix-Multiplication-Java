package MatrixMulti;

public class MatrixMulti {

    public static void main(String[] args){

        int A[][] = { //double integer array aka. [][]  //Matrix "A" has 2 rows & 3 columns.
                {5,2,1},
                {3,4,6}
        };

        int B[][]={ //double integer array aka. [][]  //Matrix "B" has 3 rows & 2 columns.
                {2,4},
                {6,1},
                {10,3}
        };

        int r[][] = new int[2][2];
        int sum=0;
        for(int i=0;i<2;i++){ //increment "i" until not < 2.
             //"2" stands for no. of columns in B & no. of rows in A.
            for(int j=0;j<2;j++){ //increment "j" until not < 2.
               // "3" stands for no. of rows in B & no. of columns in A.
                for(int k=0;k<3;k++){ //increment "k" until not < 3.

                  sum = sum  +  A[i][k]  *  B[k][j];

                }
                r[i][j] = sum;
                sum=0;

            }

        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(r[i][j] + "  "); //printing row & putting spaces between values in console.
            }
            System.out.println();
        }

    }

}


//Thanks to "Telusko" on YouTube for the amazing tutorial!
