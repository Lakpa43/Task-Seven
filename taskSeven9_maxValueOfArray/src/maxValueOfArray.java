public class maxValueOfArray {

    public static void main(String[] args) {

        int array[] = {5, 9, 7, 6, 4, 1, 2};
        System.out.println("Maximum Value of Array is: " + getMaxValue(array));

    }

    public static int getMaxValue(int[] Array) {
        int maxValue = Array[0];
        for (int i=0; i < Array.length; i++) {
            if (Array[i] > maxValue) {
                maxValue = Array[i];
            }
        }return maxValue;
    }
}
