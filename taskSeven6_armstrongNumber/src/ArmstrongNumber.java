import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println("Please enter 3 digit number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();
        int number = userNumber;

        int temp;
        int total = 0;
        for ( ; number != 0; number /= 10) {
            temp = number % 10;
            total += (temp * temp * temp);
        }
        if (total == userNumber) {
            System.out.println(userNumber + " is an Armstrong number.");
        }else System.out.println(userNumber + " is not an Armstrong number.");
    }
}
