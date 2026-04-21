import java.util.Scanner;

public class SubstringProgram {

    static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String userSub = createSubstring(str, start, end);
        String builtInSub = str.substring(start, end);

        boolean result = compareStrings(userSub, builtInSub);

        System.out.println("Manual substring: " + userSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are equal: " + result);
    }
}