package specialSubsequence;

import java.util.Scanner;

public class SpecialSubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word ");
        String alphabets = scanner.next();

        scanner.close();
        System.out.println(Counter(alphabets));

    }

    public static int Counter(String alphabets) {
        int result = 0, a_count = 0;
        for (int i = 0; i < alphabets.length(); i++) {
            if ((alphabets.charAt(i) == 'A')) {
                a_count++;
            } else if (alphabets.charAt(i) == 'G') {
                result += a_count;
            }
        }
        return result;
    }
}
