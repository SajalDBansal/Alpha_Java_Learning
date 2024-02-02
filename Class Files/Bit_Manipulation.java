public class Bit_Manipulation {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLAstIBits(int n, int i) {
        int bitMask = (-1) << i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = ((i << i) - 1);
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fast_exponentiation(int base, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans *= base;
            }
            base *= base;
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        // Introuction

        // Binary number system

        // Bitwise operator

        // Binary AND - both statements true
        // System.out.println(5 & 6);

        // Binary OR - atleast one statement true
        // System.out.println(5 | 6);

        // Binary XOR - only one statement true
        // System.out.println(5 ^ 6);

        // Binary 1's Complement
        // System.out.println(~0);

        // Binary left shift
        // System.out.println(5 << 2);

        // Binary right shift
        // System.out.println((6 >> 1));

        // Check if odd or even
        // int n = 8;
        // if ((n & 1) == 0) {
        // System.out.println("Even Number");
        // } else {
        // System.out.println("Odd Number");
        // }

        // Get ith Bit
        // System.out.println(getIthBit(10, 2));

        // Set ith Bit
        // System.out.println(setIthBit(10, 2));

        // Clear ith Bit
        // System.out.println(clearIthBit(10, 1));

        // Update ith Bit
        // System.out.println(updateIthBit(10, 2, 1));

        // Clear last i bits
        // System.out.println(clearLAstIBits(15, 2));

        // Clear range of bits
        // System.out.println(clearBitsInRange(10, 2, 4));

        // Check is a number is power of 2 or not
        // System.out.println(isPowerOf2(16));
        // System.out.println(isPowerOf2(33));

        // Count set bits in a number
        // System.out.println(countSetBits(15));

        // Fast Exponentiation
        // System.out.println(fast_exponentiation(5, 3));
    }
}