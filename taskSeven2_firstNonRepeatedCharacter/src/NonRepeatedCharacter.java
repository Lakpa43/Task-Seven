import java.util.Scanner;

public class NonRepeatedCharacter {

    public static void main(String[] args) {

        System.out.println("Please enter any word: ");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();

        for (int i=0; i < userWord.length(); i++) {
            boolean unique = true;
            for (int j=0; j < userWord.length(); j++) {
                if (i != j && userWord.charAt(i) == userWord.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non-repeated character in the String is " + userWord.charAt(i));
                break;
            }else System.out.println("There is no non-repeated character. Please enter different word.");
            break;
        }
    }
}
