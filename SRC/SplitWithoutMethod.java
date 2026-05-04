import java.util.Scanner;

class SplitWithoutMethod {

    // Method to count length without length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Count words
    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Split manually
    public static String[] splitText(String str) {
        int words = countWords(str);
        String[] result = new String[words];

        int start = 0, index = 0;

        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') {
                result[index++] = str.substring(start, i);
                start = i + 1;
            }
        }

        // last word
        result[index] = str.substring(start);

        return result;
    }

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] manual = splitText(input);
        String[] builtIn = input.split(" ");

        System.out.println("\nManual Split:");
        for (String word : manual) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtIn) {
            System.out.println(word);
        }

        System.out.println("\nAre both equal? " + compareArrays(manual, builtIn));
    }
}