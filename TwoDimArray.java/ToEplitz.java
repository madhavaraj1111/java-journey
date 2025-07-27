public class ToEplitz {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (!getRowCol(i, j, matrix)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean getRowCol(int k,int p,int[][]matrix){
	    int value = matrix[k][p];
        int i = k + 1;
        int j = p + 1;

        while (i < matrix.length && j < matrix[0].length) {
            if (matrix[i][j] != value) {
                return false;
            }
            i++;
            j++;
        }

        return true;
	}
}

// The code checks if a given 2D matrix is a Toeplitz matrix, where each descending diagonal from left to right has the same elements.

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
      
    }
}