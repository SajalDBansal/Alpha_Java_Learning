// import java.util.Scanner;

public class Functions {

    public static void hellow() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int sum_num(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomial_coefficient(int n, int r) {
        int bin_co = factorial(n) / (factorial(r) * factorial(n - r));
        return bin_co;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static boolean isPrime_opt(int num) {
        if (num == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void prime_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime_opt(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int binTodec(int bin_num) {
        int dec_num = 0;
        int pow = 0;
        while (bin_num > 0) {
            int last_digit = bin_num % 10;
            dec_num = dec_num + (last_digit * (int) Math.pow(2, pow));
            bin_num /= 10;
            pow++;
        }
        return dec_num;
    }

    public static int decTobin(int dec_num) {
        int bin_num = 0;
        int pow = 0;
        while (dec_num > 0) {
            int rem = dec_num % 2;
            bin_num = bin_num + (rem * (int) Math.pow(10, pow));
            dec_num /= 2;
            pow++;
        }
        return bin_num;

    }

    public static void main(String[] args) {

        // Syntax - function
        // hellow();

        // syntax with parameters
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // sc.close();
        // System.out.println("The sum of a and b is " + sum_num(a, b));

        // call by value
        // int a = 5;
        // int b = 10;
        // swap(a, b);
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // product of a & b
        // int prod = multiply(2, 6);
        // System.out.println(prod);

        // find factorial
        // int n = 9;
        // System.out.println("Factorial of " + n + " is " + factorial(n));

        // find binomial coefficient
        // int n = 5;
        // int r = 2;
        // System.out.println(binomial_coefficient(n, r));

        // overloading using parameters
        // System.out.println(sum(2, 5));
        // System.out.println(sum(2, 5, 6));

        // overloading using data types
        // System.out.println(sum(2, 5));
        // System.out.println(sum(3.2f, 4.8f));

        // check if number is prime or not
        // System.out.println(isPrime(12));

        // check prime optimized
        // System.out.println(isPrime_opt(88));

        // primes in range
        // prime_range(100);

        // binary to decimal
        // System.out.println(binTodec(1010));

        // decimal to binary
        // System.out.println(decTobin(15));

    }
}
