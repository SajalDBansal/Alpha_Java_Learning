public class Strings {

    public static int firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeat = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isRepeat = true;
                }
            }
            if (!isRepeat) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // Print the index of the first unrepeated element present in the string
        // For example - Input = "abcdcaf" Output = 1
        String str = "abcdcaf";
        System.out.println(firstNonRepeating(str));

    }
}