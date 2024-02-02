public class Divide_Conquer {

    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid); // left part
        mergeSort(arr, mid + 1, end); // right part

        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start; // iterator of left array
        int j = mid + 1; // iterator of right array
        int index = 0; // iterator of temp array

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }

        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= end) {
            temp[index++] = arr[j++];
        }

        for (index = 0, i = start; index < temp.length; index++, i++) {
            arr[i] = temp[index];
        }

    }

    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int pidx = partition(arr, start, end);
        quickSort(arr, start, pidx - 1); // left
        quickSort(arr, pidx + 1, end); // right
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1; // make place for ele smaller than pivot

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // swap
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    public static int search_rotated_arr(int arr[], int key, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (arr[start] <= key && key <= arr[mid]) {
                return search_rotated_arr(arr, key, start, mid - 1);
            } else {
                return search_rotated_arr(arr, key, mid + 1, end);
            }
        } else {
            if (arr[mid] <= key && key <= arr[end]) {
                return search_rotated_arr(arr, key, mid + 1, end);
            } else {
                return search_rotated_arr(arr, key, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        // Merge Sort
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // mergeSort(arr, 0, arr.length - 1);
        // print_arr(arr);

        // Quick Sort
        // int arr[] = { 6, 3, 9, 5, 2, 8, 7 };
        // quickSort(arr, 0, arr.length - 1);
        // print_arr(arr);

        // Sorted And Rotated Array
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search_rotated_arr(arr, 0, 0, arr.length - 1));
    }
}
