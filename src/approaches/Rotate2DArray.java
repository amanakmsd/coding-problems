package approaches;
//1. Reverse columns
//2  Swap Row, Columns
public class Rotate2DArray {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        reverseColumns(matrix, rows, columns);
        swapRows(matrix,rows,columns);
    }
    private void reverseColumns(int[][] matrix, int rows, int columns) {
        for(int j=0;j<columns;j++) {
            //Reverse a column.
            int lI = 0;
            int rI = rows-1;
            while (lI < rI) {
                int temp = matrix[lI][j];
                matrix[lI][j] = matrix[rI][j];
                matrix[rI][j] = temp;
                lI++;
                rI--;
            }
        }
    }
    private void swapRows(int[][] matrix, int rows, int columns) {
        for(int i =0; i< rows; i++) {
            for(int j=i; j<columns;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] value = {{1,2,3},{4,5,6},{7,8,9}};
        new Rotate2DArray().rotate(value);
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                System.out.print(value[i][j]);
    }
}
