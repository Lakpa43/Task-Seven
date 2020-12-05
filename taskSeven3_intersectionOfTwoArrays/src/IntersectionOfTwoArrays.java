public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8,1};

        for (int i=0; i < arr1.length; i++) {
            for (int j=0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common integer in both arrays: " + arr1[i]);
                }
            }
        }
    }
}
