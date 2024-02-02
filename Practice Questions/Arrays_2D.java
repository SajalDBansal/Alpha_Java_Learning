public class Arrays_2D {

    public static void print_2D_arr(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int count_elements(int matrix[][], int ele) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == ele) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sum_element_row2(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[1][i];
        }
        return sum;
    }

    public static int[][] transpose_matrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int transpose[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {

        // Question 1
        // int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        // int element = 7;
        // System.out.println(count_elements(arr, element));

        // Question 2
        // int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // System.out.println(sum_element_row2(nums));

        // Question 3
        // int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // print_2D_arr(matrix);
        // System.out.println("Transpose of the given matrix : ");
        // int transpose[][] = transpose_matrix(matrix);
        // print_2D_arr(transpose);

    }
}
