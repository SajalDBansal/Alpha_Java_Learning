import java.util.ArrayList;

public class Array_L {

    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    };

    public static int max_water_brute(ArrayList<Integer> height) {
        int max_water = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int size = Math.min(height.get(i), height.get(j));
                int curr_water = size * (j - i);
                max_water = Math.max(max_water, curr_water);
            }
        }
        return max_water;
    }

    public static int max_water_opt(ArrayList<Integer> height) {
        int start = 0;
        int end = height.size() - 1;
        int max_size = Integer.MIN_VALUE;
        while (start < end) {
            int left = height.get(start);
            int right = height.get(end);
            int length = Math.min(left, right);
            int curr_size = length * (end - start);
            max_size = Math.max(max_size, curr_size);
            if (left < right) {
                start++;
            } else {
                end--;
            }
        }
        return max_size;
    }

    public static int rain_water_trapped(ArrayList<Integer> height) {
        int n = height.size();

        // left max
        int left_max[] = new int[n];
        left_max[0] = height.get(0);
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], height.get(i));
        }

        // right max
        int right_max[] = new int[n];
        right_max[n - 1] = height.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height.get(i));
        }

        // Trapped water
        int max_water = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            int curr_water = water_level - height.get(i);
            max_water += curr_water;
        }

        return max_water;
    }

    public static boolean pair_sum_1_brute(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("( " + list.get(i) + " , " + list.get(j) + " )");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pair_sum_1_opt(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int curr_sum = list.get(start) + list.get(end);
            if (curr_sum == target) {
                System.out.println("( " + list.get(start) + " , " + list.get(end) + " )");
                return true;
            } else if (curr_sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }

    public static boolean pair_sum_2_opt(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int start = bp + 1;
        int end = bp;
        while (start != end) {
            int curr_sum = list.get(start) + list.get(end);
            if (curr_sum == target) {
                System.out.println("( " + list.get(start) + " , " + list.get(end) + " )");
                return true;
            }

            if (curr_sum > target) {
                end = (n + end - 1) % n;
            } else {
                start = (start + 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // // Introduction
        // // Java Develpoemnt Framework
        // // String | Character | Integer | Boolean
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();
        // ArrayList<String> list3 = new ArrayList<>();

        // // Operation of Arraylist
        // ArrayList<Integer> list = new ArrayList<>();
        // // Add element - time - O(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);
        // list.add(1, 9); // - time - O(n)
        // System.out.println(list);
        //
        // // get Element - time - O(1)
        // int element = list.get(2);
        // System.out.println(element);
        //
        // // Delete Element - time - On)
        // list.remove(2);
        //
        // // Set element at index - time - O(n)
        // list.set(2, 10);
        //
        // // Containes Element - time - O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
        //
        // // Print ArrayList
        // System.out.println(list);

        // // Size of arraylist
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // System.out.println(list);
        // // System.out.println(list.size());
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }

        // // Print reverse of Arraylist
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);
        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " ");
        // }

        // // Find maximum of arraylist
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        // max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);

        // // Swap Number
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // int idx1 = 1;
        // int idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // // Sorting in arraylist
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // System.out.println(list);
        // Collections.sort(list); // Ascending order
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder()); // decending order
        // System.out.println(list);

        // // multi-dimensional arraylist
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        // list.add(list1);
        // list.add(list2);
        // list.add(list3);
        // for (int i = 1; i <= 5; i++) {
        // list1.add(i * 1); // 1 2 3 4 5
        // list2.add(i * 2); // 2 4 6 8 10
        // list3.add(i * 3); // 3 6 9 12 15
        // }
        // System.out.println(list);
        // System.out.println(list.get(0).get(3));
        // for (int i = 0; i < list.size(); i++) {
        // for (int j = 0; j < list.get(i).size(); j++) {
        // System.out.print(list.get(i).get(j) + " ");
        // }
        // System.out.println();
        // }

        // container with most water - brute force
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // int container = max_water_brute(height);
        // System.out.println(container);

        // container with most water - 2 pointer approach
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // int container = max_water_opt(height);
        // System.out.println(container);

        // // Trapped rain water
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // int water_trapped = rain_water_trapped(height);
        // System.out.println(water_trapped);

        // // Pair sum - 1 - brute force & 2 pointer Approach
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // // System.out.println(pair_sum_1_brute(list, 5));
        // System.out.println(pair_sum_1_opt(list, 5));

        // // Pair sum - 2
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(11);
        // list.add(15);
        // list.add(6);
        // list.add(8);
        // list.add(9);
        // list.add(10);
        // System.out.println(pair_sum_2_opt(list, 16));

    }
}
