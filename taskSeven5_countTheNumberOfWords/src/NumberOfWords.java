import java.util.Scanner;

public class NumberOfWords {

    public static void main(String[] args) {

        System.out.println("Please enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("Number of words in your sentence: " + countWords(string));
    }

    public static int countWords(String str) {
        String[] strings = str.split(" ");
        return strings.length;
    }
}
