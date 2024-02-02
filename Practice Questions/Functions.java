public class Functions {

    public static float average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean palindrome(int n) {
        int reverse_num = 0;
        int num = n;
        while (num > 0) {
            int rem = num % 10;
            reverse_num = reverse_num * 10 + rem;
            num /= 10;
        }
        System.out.println("reversed number : " + reverse_num);
        if (n == reverse_num) {
            return true;
        }
        return false;
    }

    public static int digit_sum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Question 1
        // System.out.println(average(10, 20, 30));

        // Question 2
        // System.out.println(isEven(33));

        // Question 3
        // System.out.println(palindrome(123));

        // Question 4
        // a.Math.min( ) = minimum of given number
        // b.Math.max( ) = maximum in given number
        // c.Math.sqrt( ) = sqare root of the given number
        // d.Math.pow( ) = a to the power of b in pow(a,b)
        // e.Math.avg( ) = average of the given numbers
        // f.Math.abs( ) = gives the absolute value of the number

        // Question 5
        // System.out.println(digit_sum(345));

    }
}
