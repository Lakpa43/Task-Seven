import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        System.out.println("Please enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();

        System.out.println("Unique Characters: ");

        for (int i=0; i < userWord.length(); i++) {
            boolean unique = true;
            for (int j=0; j < userWord.length(); j++) {
                if (i != j && userWord.charAt(i) == userWord.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.print(userWord.charAt(i) + " ");
            }
        }
    }
}
