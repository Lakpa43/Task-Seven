import java.util.Scanner;

public class PermutationsOfString {

    public static void main(String[] args) {

        System.out.println("Please enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        int len = userWord.length();

        PermutationsOfString permutationsOfString = new PermutationsOfString();
        System.out.println("Permutation of entered word: ");
        permutationsOfString.permute(userWord, 0, len-1);
    }
    public String swapChar(String string, int x, int y) {
        char temp;
        char[] charArr = string.toCharArray();
        temp = charArr[x];
        charArr[x] = charArr[y];
        charArr[y] = temp;
        return String.valueOf(charArr);
    }

    private void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        }else {
            for (int i = left; i <= right; i++) {
                str = swapChar(str, left, i);
                permute(str, left+1, right);
                str = swapChar(str, left, i);
            }
        }
    }
}
