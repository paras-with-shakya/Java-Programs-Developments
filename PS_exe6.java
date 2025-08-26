public class PS_exe6 {
    public static void main(String[] args) {

        // Problem 1==>Calculate the total marks from an array of float values
        // float[] marks = { 85.5f, 90.0f, 78.5f, 88.0f, 92.5f };
        // float sum = 0;
        // for (float element : marks) {
        // sum = sum + element;
        // }
        // System.out.println("Total marks: " + sum);

        /*
         * Problem 2
         * float[] marks = { 85.5f, 90.0f, 78.5f, 88.0f, 92.5f };
         * float num = 85.5f;
         * boolean isInArray = false;
         * for (float element : marks) {
         * if (num == element) {
         * isInArray = true;
         * break;
         * }
         * }
         * if (isInArray) {
         * System.out.println("The velue is present in the array.");
         * } else {
         * System.out.println("The velue is not present in the array.");
         * }
         */

        // Problem 3

        /*
         * float[] marks = { 85.5f, 90.0f, 78.5f, 88.0f, 92.5f };
         * float sum = 0;
         * for (float element : marks) {
         * sum = sum + element;
         * }
         * System.out.println("Total Average marks in : " + sum / marks.length);
         */

        // Problem 4
        /*
         * int[][] mat1 = { { 1, 2, 3 },
         * { 4, 5, 6 } };
         * int[][] mat2 = { { 2, 4, 6 },
         * { 4, 5, 6 } };
         * int[][] result = { { 0, 0, 0 },
         * { 0, 0, 0 } };
         * for (int i = 0; i < mat1.length; i++) {
         * for (int j = 0; j < mat1[i].length; j++) {
         * System.out.format("Satting value for i=%d, j=%d\n", i, j);
         * result[i][j] = mat1[i][j] + mat2[i][j];
         * }
         * }
         * // Printing the elements of a 2D array
         * for (int i = 0; i < result.length; i++) { // row number of line
         * for (int j = 0; j < result[i].length; j++) { // column number of line
         * System.out.print(result[i][j] + " ");
         * result[i][j] = mat1[i][j] + mat2[i][j];
         * }
         * System.out.println(" ");// New line after each row
         * }
         */

        // Problem 5

        /*
         * int[] arr = { 1, 21, 3, 46, 51, 6 };
         * int L = arr.length;
         * int n = Math.floorDiv(L, 2);
         * int temp;
         * 
         * for (int i = 0; i < n; i++) {
         * // swap arr[i] and arr[L-i-1]
         * // a b temp
         * // |3| |4| ||
         * temp = arr[i];
         * arr[i] = arr[L - i - 1];
         * arr[L - i - 1] = temp;
         * }
         * for (int element : arr) {
         * System.out.print(element + " ");
         * }
         */

        // Problem 6

        /*
         * int[] arr = { 1, 21, 3, 46, 51, 6 };
         * int max = Integer.MIN_VALUE;
         * for (int element : arr) {
         * if (element > max) {
         * max = element;
         * }
         * }
         * System.out.println("The maximum element in the array is: " + max);
         */

        // Problem 7

        /*
         * int[] arr = { 1, 21, 3, 46, 51, 6 };
         * int min = -Integer.MAX_VALUE; // Integer.MAX_VALUE can also be used
         * for (int element : arr) {
         * if (element > min) {
         * min = element;
         * }
         * }
         * System.out.println(Integer.MIN_VALUE);
         * System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
         * System.out.println("The minimum element in the array is: " + min);
         */

        // Problem 8

        boolean isSorted = true;
        int[] arr = { 1, 2, 3, 46, 51, 66 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
