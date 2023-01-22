public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int numRows = image.length;
        int numCols = image[0].length;
        int color = image[sr][sc];
        fillNeighbours(image,numRows,numCols,color,newColor, sr,sc);
        return image;
    }
    private void fillNeighbours(int[][] image, int numRows, int numCols, int color, int newColor, int sr, int sc) {
        if(sr>=numRows || sr< 0 || sc>=numCols || sc<0 ) {
            return;
        }
        if(image[sr][sc] != color || image[sr][sc] == newColor) {
            return;
        }
        image[sr][sc] = newColor;
        fillNeighbours(image, numRows, numCols, color, newColor, sr+1, sc);
        fillNeighbours(image, numRows, numCols, color, newColor, sr-1, sc);
        fillNeighbours(image, numRows, numCols, color, newColor, sr, sc+1);
        fillNeighbours(image, numRows, numCols, color, newColor, sr, sc-1);
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,1}};
        int numRows = arr.length;
        int numCols = arr[0].length;
        arr = new FloodFill().floodFill(arr,1,1, 1);
        for(int i =0; i< numRows; i++) {
            for(int j =0; j<numCols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
