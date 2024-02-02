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
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                System.out.println("Already Sorted array");
                break;
            }
        }
        print_arr(arr);
    }

    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_value = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_value] > arr[j]) {
                    min_value = j;
                }
            }
            // swap
            int temp = arr[min_value];
            arr[min_value] = arr[i];
            arr[i] = temp;
            print_arr(arr);

        }
        System.out.println();
        print_arr(arr);
    }

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        print_arr(arr);
    }

    public static void counting_sort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int count_arr[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count_arr[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count_arr.length; i++) {
            while (count_arr[i] > 0) {
                arr[index] = i;
                index++;
                count_arr[i]--;
            }
        }
        print_arr(arr);
    }

    public static void main(String[] args) {

        // Bubble sort
        // int arr[] = { 5, 4, 1, 3, 2 };
        // print_arr(arr);
        // bubble_sort(arr);

        // Selection sort
        // int arr[] = { 5, 4, 1, 3, 2 };
        // selection_sort(arr);

        // insertion sort
        // int num[] = { 5, 4, 1, 3, 2 };
        // insertion_sort(num);

        // inbuilt sort
        // int arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        // print_arr(arr);

        // Inbuild function for reverse sorting
        // Integer arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr, Collections.reverseOrder());
        // print_arr(arr);

        // Counting sort
        int nums[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        counting_sort(nums);

    }
}
