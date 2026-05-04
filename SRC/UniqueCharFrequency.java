import java.util.Scanner;

class UniqueCharFrequency {

    // Find unique characters
    public static char[] uniqueCharacters(String str) {
        int len = str.length();
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index++] = str.charAt(i);
            }
        }

        // Copy to exact size array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] getFrequencyWithUnique(String str) {
        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(str);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] data = getFrequencyWithUnique(input);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}