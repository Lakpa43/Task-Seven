import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Please enter a string:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(userInput);
        stringBuilder = stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
