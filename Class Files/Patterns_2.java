public class Patterns_2 {

    public static void hollow_square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == n - 1) || (i == 0) || (j == 0) || (j == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hollow_rectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == n - 1) || (i == 0) || (j == 0) || (j == m - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void inverted_half_pyramid_numbers(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void floyds_triangle(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (a < 10) {
                    System.out.print(a + "  ");
                } else {
                    System.out.print(a + " ");
                }
                a++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void binary_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= n; k++) {
                if (k > (n - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= n; k++) {
                if (k > (n - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void solid_rhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < n; k++) {
                if ((i == 0) || (i == n - 1) || (k == 0) || (k == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void daimond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (i * 2 + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (i * 2 + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(i + 1 + "   ");
            }
            System.out.println();
        }
    }

    public static void palindromic_pyramid_number(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print((n - j + 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // hollow_square(5);

        // hollow_rectangle(5, 6);

        // inverted_rotated_half_pyramid(4);

        // inverted_half_pyramid_numbers(5);

        // floyds_triangle(5);

        // binary_triangle(5);

        // butterfly(4);

        // solid_rhombus(5);

        // hollow_rhombus(5);

        // daimond(4);

        // number_pyramid(5);

        // palindromic_pyramid_number(5);
    }
}
