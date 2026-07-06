//public class SetMatrixZero {
//
//    static void markRow(int[][] matrix, int row, int m) {
//        for (int j = 0; j < m; j++) {
//            if (matrix[row][j] != 0) {
//                matrix[row][j] = -1;
//            }
//        }
//    }
//
//    static void markCol(int[][] matrix, int col, int n) {
//        for (int i = 0; i < n; i++) {
//            if (matrix[i][col] != 0) {
//                matrix[i][col] = -1;
//            }
//        }
//    }
//
//    static void setZeroes(int[][] matrix) {
//
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        // Step 1: Mark rows and columns
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//
//                if (matrix[i][j] == 0) {
//                    markRow(matrix, i, m);
//                    markCol(matrix, j, n);
//                }
//            }
//        }
//
//        // Step 2: Convert -1 to 0
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//
//                if (matrix[i][j] == -1) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int[][] matrix = {
//                {1, 1, 1, 1},
//                {1, 0, 0, 1},
//                {1, 1, 0, 1},
//                {1, 1, 1, 1}
//        };
//
//        setZeroes(matrix);
//
//        for (int[] row : matrix) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//




public class SetMatrixZero{

    public static void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if first row contains a zero
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column contains a zero
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark column
                }
            }
        }

        // Set cells to zero using markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Handle first row
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Handle first column
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}