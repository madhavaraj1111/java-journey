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

