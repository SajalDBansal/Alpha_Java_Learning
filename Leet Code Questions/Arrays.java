public class Arrays {

    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int remove_duplicate(int arr[]) {
        int count = 0;
        int prev_num = arr[0] = arr[count++];
        for (int i = 1; i < arr.length; i++) {
            int curr_num = arr[i];
            if (curr_num != prev_num) {
                arr[count] = arr[i];
                count++;
                prev_num = curr_num;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Question 1
        // int nums[] = { 2, 7, 11, 15 };
        // int ans[] = twoSum(nums, 9);
        // print_arr(ans);

        // Question 26
        // int nums[] = { 1, 1, 2 };
        // System.out.println(remove_duplicate(nums));

        // Question 27

    }
}
