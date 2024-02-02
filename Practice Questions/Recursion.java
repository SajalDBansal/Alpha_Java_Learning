public class Recursion {

    public static void key_indices(int arr[], int key, int index) {
        if (index == arr.length) {
            return;
        }

        if (key == arr[index]) {
            System.out.print(index + " ");
        }
        key_indices(arr, key, index + 1);
    }

    public static String word[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static String num_to_word(int n, String ans) {
        if (n == 0) {
            return ans.toString();
        }

        ans = num_to_word(n / 10, ans);

        int last = n % 10;
        return ans += (word[last] + " ");

    }

    public static int str_length(String str, int n) {
        if (str.equals("")) {
            return n;
        }

        return str_length(str.substring(1), n + 1);

    }

    public static void tower_of_hanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transferd disk " + n + " from " + src + " to " + dest + " with help of " + helper);
            return;
        }

        tower_of_hanoi(n - 1, src, dest, helper);
        System.out.println("Transferd disk " + n + " from " + src + " to " + dest + " with help of " + helper);
        tower_of_hanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {

        // Question 1
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // key_indices(arr, key, 0);

        // Question 2
        // int num = 2019;
        // System.out.println(num_to_word(num, ""));

        // Question 3
        // String str = "Sajal";
        // System.out.println(str_length(str, 0));

        // Question 4
        // String str = "abcab";

        // Question 5
        // int disks = 3;
        // tower_of_hanoi(disks, "A", "B", "C");
    }
}
