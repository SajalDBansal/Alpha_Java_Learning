import java.util.Arrays;

public class Strings {

    public static int count_lowercase_vowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }

    public static boolean anagram_strings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Question 1
        // String str = "Sajal Dutt Bansal A";
        // System.out.println(count_lowercase_vowel(str));

        // Question 2
        // false true

        // Question 3
        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);
        // Apnacoege //Remove all "l" from the string

        // Question 4
        // String s1 = "race";
        // String s2 = "care";
        // System.out.println(anagram_strings(s1, s2));

        // Question 5
        // .intern()
        // StringBuffer

    }
}
