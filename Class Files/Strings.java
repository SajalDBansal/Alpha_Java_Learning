// import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean palindrome_String(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int shortest_path(String derc) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < derc.length(); i++) {
            switch (derc.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    System.out.println("Error in the Direction String");
                    return -1;
            }
        }

        // Displacement
        int distance = (int) Math.sqrt((x * x) + (y * y));
        return distance;
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String to_uppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void string_compression(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count != 1) {
                sb.append(count);
            }

        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        // Introduction
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Input / Output
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // Print single word
        // System.out.println(name);
        // String full_name = sc.nextLine(); // Print the whole line
        // System.out.println(full_name);
        // sc.close();

        // String length
        // String full_name = "Tony Stark";
        // System.out.println(full_name.length());

        // String concatenate
        // String fisrt_name = "Sajal";
        // String last_name = "Dutt Bansal";
        // String full_name = fisrt_name + " " + last_name;
        // System.out.println(full_name);

        // String ChatAt method
        // String fisrt_name = "Sajal";
        // String last_name = "Dutt Bansal";
        // String full_name = fisrt_name + " " + last_name;
        // System.out.println(fisrt_name.charAt(0));
        // System.out.println(fisrt_name.charAt(1));
        // printLetters(full_name);

        // Check if palindrome
        // String str = "racecar";
        // System.out.println(palindrome_String(str));

        // Question - shortest path
        // String der = "WNEENESENNN";
        // int distance = shortest_path(der);
        // System.out.println(distance);

        // String compare function
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");
        // if (s1 == s2) {
        // System.out.println("Strings Are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        // if (s1 == s3) {
        // System.out.println("Strings Are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        // if (s1.equals(s3)) {
        // System.out.println("Strings Are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // String substring function
        // String str = "HelloWorld";
        // System.out.println(str.substring(0, 5));
        // System.out.println(substring(str, 0, 5));

        // Print largest string
        // String fruits[] = { "apple", "mango", "banana" };
        // String largest = fruits[0];
        // for (int i = 0; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }
        // System.out.println(largest);

        // Why string is immutable

        // StringBuilder
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());

        // Convert first letter to Uppercase
        // String str = "hi, i am sajal dutt";
        // System.out.println(to_uppercase(str));

        // String compresion
        // String str = "aaabbcccdd";
        // string_compression(str);
    }
}