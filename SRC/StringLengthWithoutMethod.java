import java.util.Scanner;

class StringLengthWithoutMethod {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // keep accessing
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);
        int actualLength = input.length();

        System.out.println("Length (without method): " + customLength);
        System.out.println("Length (built-in): " + actualLength);
    }
}