import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Arrays {

    public static boolean is_double(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int max_profit(int arr[]) {
        int max_profit = 0;
        int buy_price = arr[0];
        int sell_price = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buy_price > arr[i]) {
                buy_price = arr[i];
            } else {
                sell_price = arr[i];
                int curr_profit = sell_price - buy_price;
                max_profit = Math.max(max_profit, curr_profit);
            }
        }
        return max_profit;
    }

    public static int trapped_water(int height[]) {
        int n = height.length;
        int left_max[] = new int[n];
        int right_max[] = new int[n];

        // left max array
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        }

        // right max array
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i]);
        }

        // Trapped water
        int total_trapped_water = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            int stored_water = water_level - height[i];
            total_trapped_water += stored_water;
        }
        return total_trapped_water;
    }

    public static void triplet(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("Tripet : " + arr[i] + " , " + arr[j] + " , " + arr[k]);
                    }
                }
            }
        }
    }

    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args) {

        // Question 1
        // int nums[] = { 1, 2, 3, 4 };
        // System.out.println(is_double(nums));

        // Question 2

        // Question 3
        // int prices[] = { 7, 6, 4, 3, 1 };
        // System.out.println(max_profit(prices));

        // Question 4
        // int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // int nums[] = { 4, 2, 0, 3, 2, 5 };
        // System.out.println(trapped_water(nums));

        // Question 5
        int nums[] = { -1, 0, 1, 2, -1, 4 };
        triplet(nums);
        // System.out.println(threeSum(nums));
    }
}
