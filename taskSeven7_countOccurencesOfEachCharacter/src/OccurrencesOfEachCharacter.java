import java.util.Scanner;

public class OccurrencesOfEachCharacter {

    public static void main(String[] args) {

        System.out.println("Enter the String: ");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        String str = userString.toLowerCase();

        int count = 0;
        for (char i='a'; i <= 'z'; i++) {
            for (int j=0; j < str.length(); j++)
                if (str.charAt(j) == i) {
                    count++;
                }
            if (count != 0) {
                System.out.println("Occurrence of " + i + " = " + count);
                count = 0;
            }
        }
    }
}
