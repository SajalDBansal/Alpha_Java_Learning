import java.util.*;

public class Arrays_2D {

    public static void input_2D_arr(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void print_2D_arr(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search_in_2D_arr(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key Found at index : (" + i + " , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Index not found");
        return false;
    }

    public static void largest_smallest_ele_2D_arr(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("Largest element of 2D array is : " + largest);
        System.out.println("Smallest element of 2D array is : " + smallest);
    }

    public static void spiral_matrix(int matrix[][]) {
        int start_row = 0;
        int end_row = matrix.length - 1;
        int start_col = 0;
        int end_col = matrix[0].length - 1;

        while (start_row <= end_row && start_col <= end_col) {
            for (int j = start_col; j <= end_col; j++) {
                System.out.print(matrix[start_row][j] + " ");
            }
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.print(matrix[i][end_col] + " ");
            }
            for (int j = end_col - 1; j >= start_col; j--) {
                if (start_row == end_row) {
                    break;
                }
                System.out.print(matrix[end_row][j] + " ");
            }
            for (int i = end_row - 1; i >= start_row + 1; i--) {
                if (start_col == end_col) {
                    break;
                }
                System.out.print(matrix[i][start_col] + " ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }

    public static void daigonal_sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || j == matrix.length - i - 1 && i != matrix.length - i - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Daigonal sum : " + sum);
    }

    public static void daigonal_sum_opt(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Daigonal sum is : " + sum);
    }

    public static boolean search_sorted_2d_arr(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("The key is found at index : (" + row + " , " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key is not found in the matrix");
        return false;
    }

    public static boolean search_sorted_2d_arr_ops(int matrix[][], int key) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("The key is found at index : (" + row + " , " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Key is not found in the matrix");
        return false;
    }

    public static void main(String[] args) {

        // Introduction to 2d Array

        // creation of 2d Array
        // int matrix[][] = new int[3][3];
        // input_2D_arr(matrix);
        // print_2D_arr(matrix);
        // search_in_2D_arr(matrix, 6);
        // largest_smallest_ele_2D_arr(matrix);

        // 2D array in memory

        // spiral matrix
        // int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
        // 14, 15, 16 } };
        // spiral_matrix(matrix);

        // daigonal sum
        // int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
        // 14, 15, 16 } };
        // daigonal_sum(matrix);
        // daigonal_sum_opt(matrix);

        // search in sorted Matrix
        // int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48
        // }, { 32, 33, 39, 50 } };
        // int key = 29;
        // search_in_2D_arr(matrix, key);
        // search_sorted_2d_arr_ops(matrix, key);
    }
}
