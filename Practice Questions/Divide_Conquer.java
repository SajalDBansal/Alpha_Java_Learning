public class Divide_Conquer {

    public static void print_arr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }

    public static void mergeSort(String str[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(str, start, mid);
        mergeSort(str, mid + 1, end);

        merge(str, start, mid, end);

    }

    public static void merge(String str[], int start, int mid, int end) {
        String temp[] = new String[end - start + 1];
        int tidx = 0;
        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (str[i].compareTo(str[j]) < 1) {
                temp[tidx++] = str[i++];
            } else {
                temp[tidx++] = str[j++];
            }
        }

        while (i <= mid) {
            temp[tidx++] = str[i++];
        }

        while (j <= end) {
            temp[tidx++] = str[j++];
        }

        for (tidx = 0, i = start; tidx < temp.length; tidx++, i++) {
            str[i] = temp[tidx];
        }
    }

    public static int majority_Elements(int arr[], int start, int end) {
        if (start >= end) {
            return arr[start];
        }

        int mid = start + (end - start) / 2;
        int left_major = majority_Elements(arr, start, mid);
        int right_major = majority_Elements(arr, mid + 1, end);

        if (left_major == right_major) {
            return left_major;
        }

        int left_count = count_ele(arr, left_major, start, end);
        int right_count = count_ele(arr, right_major, start, end);

        return left_count > right_count ? left_major : right_major;
    }

    public static int count_ele(int arr[], int key, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Question 1
        // String arr[] = { "sun", "earth", "mars", "mercury" };
        // mergeSort(arr, 0, arr.length - 1);
        // print_arr(arr);

        // Question 2
        // int nums[] = { 2, 2, 1, 1, 1, 2, 2, 1, 1 };
        // System.out.println(majority_Elements(nums, 0, nums.length - 1));

    }
}
