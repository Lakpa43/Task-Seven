public class SubArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int givenSum = 12;
        findSubArrays(arr, givenSum);
    }

    public static void findSubArrays(int[] arr, int givenSum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == givenSum) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }else if (sum > givenSum) {
                    break;
                }
            }
        }
    }
}
