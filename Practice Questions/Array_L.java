// import java.util.ArrayList;
// import java.util.Collections;

public class Array_L {

    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        // // Question 1
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(2);
        // list.add(3);
        // boolean increase = true;
        // boolean decrease = true;
        // for (int i = 0; i < list.size() - 1; i++) {
        // if (list.get(i) > list.get(i + 1)) {
        // increase = false;
        // }
        // if (list.get(i) < list.get(i + 1)) {
        // decrease = false;
        // }
        // }
        // System.out.println(increase || decrease);

        // Question 2
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(6);
        // list.add(5);
        // list.add(8);
        //
        // list.add(1);
        // list.add(3);
        // list.add(5);
        // list.add(3);
        // Collections.sort(list);
        // System.out.println(list);
        // int n = list.size();
        // for (int i = 1; i < n - 1; i++) {
        // if (list.get(i - 1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i + 1)) {
        // System.out.println(list.get(i));
        // }
        //
        // }
        // if (n == 1) {
        // System.out.println(list.get(0));
        // }
        // if (n > 1) {
        // if (list.get(0) + 1 != list.get(1)) {
        // System.out.println(list.get(0));
        // }
        // if (list.get(n - 1) - 1 != list.get(n - 2)) {
        // System.out.println(list.get(n - 1));
        // }
        // }

        // Question 3
        // ArrayList<Integer> list = new ArrayList<>();
        // // list.add(1);
        // // list.add(100);
        // // list.add(200);
        // // list.add(1);
        // // list.add(100);
        // // int key = 1;
        //
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(3);
        // int key = 2;
        // int targetList[] = new int[1000];
        // for (int i = 0; i < list.size(); i++) {
        // if (list.get(i) == key) {
        // targetList[list.get(i + 1) - 1]++;
        // }
        // }
        // int max = Integer.MIN_VALUE;
        // int ans = 0;
        // for (int i = 0; i < targetList.length; i++) {
        // if (targetList[i] > max) {
        // max = targetList[i];
        // ans = i + 1;
        // }
        // }
        // System.out.println(ans);

        // Question 4

    }
}
