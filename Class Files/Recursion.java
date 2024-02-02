public class Recursion {

    public static void decreasing_num(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasing_num(n - 1);
    }

    public static void increasing_num(int n) {
        if (n == 0) {
            return;
        }
        increasing_num(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int natural_num_sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + natural_num_sum(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean check_sorted_arr(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return check_sorted_arr(arr, index + 1);
    }

    public static int first_Occurence(int arr[], int ele, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == ele) {
            return i;
        }
        return first_Occurence(arr, ele, i + 1);
    }

    public static int last_Occurence(int arr[], int ele, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = last_Occurence(arr, ele, i + 1);
        if (isFound == -1 && arr[i] == ele) {
            return i;
        }

        return isFound;

    }

    public static int x_power_n(int x, int n) {
        if (n == 1) {
            return x;
        }

        int prev_ans = x_power_n(x, n - 1);

        return x * prev_ans;
    }

    public static int x_power_n_opt(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half_pow = x_power_n_opt(x, n / 2);
        if (n % 2 != 0) {
            return x * half_pow * half_pow;
        }
        return half_pow * half_pow;
    }

    public static int tilling_prbl(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int vertical_ways = tilling_prbl(n - 1);
        int horizantal_ways = tilling_prbl(n - 2);
        int total_ways = vertical_ways + horizantal_ways;

        return total_ways;
    }

    public static String remove_Duplicate(String str, int index, StringBuilder ans, boolean[] map) {
        if (index == str.length()) {
            return ans.toString();
        }

        if (map[str.charAt(index) - 'a'] == true) {
            return remove_Duplicate(str, index + 1, ans, map);
        } else {
            map[str.charAt(index) - 'a'] = true;
            return remove_Duplicate(str, index + 1, ans.append(str.charAt(index)), map);
        }
    }

    public static int friend_paring(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int stand_alone = friend_paring(n - 1);
        int stand_pair = (n - 1) * friend_paring(n - 2);
        int total_ways = stand_alone + stand_pair;
        return total_ways;
    }

    public static void print_Bin_str(int n, int last, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        print_Bin_str(n - 1, 0, str + "0");

        if (last == 0) {
            print_Bin_str(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        // Print number in decreasing order
        // decreasing_num(10);

        // print number in increasing order
        // increasing_num(10);

        // find factorial of n
        // System.out.println(factorial(-5));

        // print sum of n natural numbers
        // System.out.println(natural_num_sum(5));

        // print nth fibonacci number
        // System.out.println(fibonacci(17));

        // check if array s sorted or not
        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(check_sorted_arr(arr, 0));

        // first occurence
        // int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // int ele = 5;
        // System.out.println(first_Occurence(arr, ele, 0));

        // last occurence
        // System.out.println(last_Occurence(arr, ele, 0));

        // print x to the power n
        // System.out.println(x_power_n_opt(2, 10));
        // System.out.println(x_power_n(2, 10));

        // tilling problem
        // System.out.println(tilling_prbl(5));

        // remove duplicate in a string
        // System.out.println(remove_Duplicate("apnacollege", 0, new StringBuilder(""),
        // new boolean[26]));

        // friends pairing problem
        // System.out.println(friend_paring(4));

        // binary string problem
        // print_Bin_str(3, 0, "");
    }
}
