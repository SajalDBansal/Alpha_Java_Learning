import java.util.Scanner;

public class Arrays {

    public static void input_arr(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            // Taking input from user
            System.out.print("Enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

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

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i]++;
        }
    }

    public static int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                // System.out.println("The key is found at index " + i);
                return i;
            }
        }
        // System.out.println("Key not found");
        return -1;
    }

    public static int largest_in_array(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        return largest;
    }

    public static int binary_search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void reverse_arr(int arr[]) {
        for (int i = 0; i <= arr.length / 2; i++) {
            int start = i;
            int end = arr.length - 1 - i;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static void pairs_in_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " , " + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void subarrays(int arr[]) {
        int total_subarray = 0;
        int max_subarray_sum = Integer.MIN_VALUE;
        int min_subarray_sum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int curr_subarray_sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    curr_subarray_sum += arr[k];
                }

                System.out.println(" = " + curr_subarray_sum);

                total_subarray++;
                max_subarray_sum = Math.max(max_subarray_sum, curr_subarray_sum);
                min_subarray_sum = Math.min(min_subarray_sum, curr_subarray_sum);
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + total_subarray);
        System.out.println("Maximum Subarray sum is : " + max_subarray_sum);
        System.out.println("Manimum Subarray sum is : " + min_subarray_sum);
    }

    public static void max_subarray_sum(int num[]) {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int curr_sum = 0;
                for (int k = i; k <= j; k++) {
                    curr_sum += num[k];
                }
                max_sum = Math.max(max_sum, curr_sum);
                min_sum = Math.min(min_sum, curr_sum);
            }
        }
        System.out.println("Maximum subarray sum : " + max_sum);
        System.out.println("Manimum subarray sum : " + min_sum);
    }

    public static void max_subarray_sum_prefix(int num[]) {
        int max_sum = Integer.MIN_VALUE;
        int perfix_arr[] = new int[num.length];

        perfix_arr[0] = num[0];
        for (int i = 1; i < perfix_arr.length; i++) {
            perfix_arr[i] = perfix_arr[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int curr_sum = 0;
            for (int k = i; k < num.length; k++) {
                curr_sum = i == 0 ? perfix_arr[k] : perfix_arr[k] - perfix_arr[i - 1];
                System.out.println(curr_sum);
                max_sum = Math.max(max_sum, curr_sum);
            }
        }

        print_arr(perfix_arr);
        System.out.println("Max subarray sum : " + max_sum);
    }

    public static void max_subarray_sum_kadance(int num[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            curr_sum += num[i];

            max_sum = Math.max(max_sum, curr_sum);

            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        System.out.println("Max subarray sum : " + max_sum);
    }

    public static void trapping_rainwater(int arr[]) {
        int n = arr.length;
        // create auxilary arrays
        int left_to_right_max[] = new int[n];
        int right_to_left_max[] = new int[n];

        left_to_right_max[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left_to_right_max[i] = Math.max(left_to_right_max[i - 1], arr[i]);
        }

        right_to_left_max[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_to_left_max[i] = Math.max(right_to_left_max[i + 1], arr[i]);
        }

        // trapped water
        int trapped_water = 0;
        for (int i = 0; i < n; i++) {
            int max_height = Math.min(left_to_right_max[i], right_to_left_max[i]);
            int curr_height_trapped = max_height - arr[i];
            trapped_water += curr_height_trapped;
        }

        System.out.println("Total trapped rainwater : " + trapped_water);
    }

    public static void best_time_stock(int price[]) {
        int buy_price = Integer.MAX_VALUE;
        int sell_price = 0;
        int max_profit = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] > buy_price) {
                sell_price = price[i];
                int curr_profit = sell_price - buy_price;
                max_profit = Math.max(max_profit, curr_profit);
            } else {
                buy_price = price[i];
            }

        }
        System.out.println("max profit : " + max_profit);
    }

    public static void container_most_water(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int max_sixe = Integer.MIN_VALUE;
        while (start < end) {
            int height = Math.min(arr[start], arr[end]);
            int curr_size = height * (end - start);
            max_sixe = Math.max(max_sixe, curr_size);
            if (arr[start] < arr[end]) {
                start++;
            } else {
                end--;
            }

        }
        System.out.println("Maximum Sixe of container : " + max_sixe);
    }

    public static void main(String[] args) {

        // Introduction to array

        // array creation
        // int marks[] = new int[50]; //starts with 0 index and ends with n-1 index
        // int numbers[] = { 1, 2, 3, 4, 5 };
        // String fruits[] = { "mango", "banana", "apple" };

        // Input and output in arrays
        // Scanner sc = new Scanner(System.in);
        // int marks[] = new int[100];
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Physics : " + marks[0] + "\nChemistry : " + marks[1] +
        // "\nMaths : " + marks[2]);
        // marks[2]++;
        // System.out.println("Maths : " + marks[2]);
        // System.out.println("Length of marks : " + marks.length);
        // sc.close();

        // Arrays as function arguments
        // int marks[] = new int[50];
        // input_arr(marks, 3);
        // int marks[] = { 97, 98, 99 };
        // print_arr(marks);
        // update(marks);
        // print_arr(marks);

        // linear search
        // int list[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 12;
        // int index = linear_search(list, key);
        // if (index == -1) {
        // System.out.println("Key not found");
        // } else {
        // System.out.println("Key is found at index : " + index);
        // }

        // largest in array
        // int nums[] = { 1, 2, 3, 7, 4, 5, 6 };
        // int largest = largest_in_array(nums);
        // System.out.println("The largest number in the array is : " + largest);

        // binary search
        // Prerequisite - sorted array
        // int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        // int key = 10;
        // int index = binary_search(num, key);
        // if (index == -1) {
        // System.out.println("Key not found");
        // } else {
        // System.out.println("The key is found at index : " + index);
        // }

        // reverse in array
        // int arr[] = { 2, 4, 6, 8, 10 };
        // System.out.println("Actual array : ");
        // print_arr(arr);
        // System.out.println("Reversed array : ");
        // reverse_arr(arr);
        // print_arr(arr);

        // pairs in array
        // int arr[] = { 2, 4, 6, 8, 10 };
        // pairs_in_arr(arr);

        // print sub arrays
        // int arr[] = { 2, 4, 6, 8, 10 };
        // subarrays(arr);

        // max sub arrays sum (brute force)
        // int nums[] = { 1, -2, 6, -1, 3 };
        // max_subarray_sum(nums);

        // max sub arrays sum (prefix sum)
        // int nums[] = { 1, -2, 6, -1, 3 };
        // max_subarray_sum_prefix(nums);

        // max sub arrays sum (kadance algorithim)
        // int arr[] = { 1 };
        // max_subarray_sum_kadance(arr);

        // trapping rain water
        // int height[] = { 4, 2, 0, 1, 3, 2, 5 };
        // trapping_rainwater(height);

        // best time to buy & sell stock
        // int prices[] = { 7, 6, 4, 3, 1 };
        // best_time_stock(prices);

        // Container with maximum water
        // int arr[] = { 2, 3, 4, 5, 18, 17, 6 };
        // container_most_water(arr);
    }
}
