import java.util.Scanner;

class WordsWithLength {

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

    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < findLength(str); i++) {
            if (str.charAt(i) == ' ') count++;
        }
        return count;
    }

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

        result[index] = str.substring(start);
        return result;
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitText(input);
        String[][] data = wordsWithLength(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + length);
        }
    }
}