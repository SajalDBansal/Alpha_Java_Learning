// import java.util.Arrays;
// import java.util.Collections;

public class Sorting {

    public static void print_arr(int arr[]) {
        // Check if the array is empty
        if (arr.length == 0) {
            System.out.println("Null Array");
            return;
        }

        // Printing the values of array
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(" " + arr[i] + " ");

            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }

    public static void print_arr(Integer arr[]) {
        // Check if the array is empty
        if (arr.length == 0) {
            System.out.println("Null Array");
            return;
        }

        // Printing the values of array
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(" " + arr[i] + " ");

            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }

    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array using bubble sort : ");
        print_arr(arr);
    }

    public static void selection_sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array using selection sort : ");
        print_arr(arr);
    }

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        System.out.print("Sorted array using insertion sort : ");
        print_arr(arr);
    }

    public static void counting_sort(int arr[]) {
        int max_ele = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max_ele = Math.max(max_ele, arr[i]);
        }
        int count_arr[] = new int[max_ele + 1];
        for (int i = 0; i < arr.length; i++) {
            count_arr[arr[i]]++;
        }
        int index = 0;
        for (int i = count_arr.length - 1; i >= 0; i--) {
            while (count_arr[i] > 0) {
                arr[index] = i;
                index++;
                count_arr[i]--;
            }
        }
        System.out.print("Sorted array using count sort is : ");
        print_arr(arr);
    }

    public static void main(String[] args) {

        // int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // System.out.print("Original Array is : ");
        // print_arr(arr);

        // Bubble sort
        // bubble_sort(arr);

        // Selection sort
        // selection_sort(arr);

        // Insertion sort
        // insertion_sort(arr);

        // Count sort
        // counting_sort(arr);

        // inbuild sort
        // Integer arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println("Sorted array using inbuild sort function : ");
        // print_arr(arr);
    }
}
