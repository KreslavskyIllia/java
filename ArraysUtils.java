package ru.geekbrains;

public class ArraysUtils {
    private ArraysUtils() {}

    public static int[] arrayAfterLastFour(int[] arr) {
        int maxIndexOfFour = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4 && i > maxIndexOfFour) {
                maxIndexOfFour = i;
            }
        }
        int index = maxIndexOfFour + 1;
        int[] arrNew = new int[arr.length - index];
        for( int i = 0; i < arrNew.length; i++) {
            arrNew[i] = arr[index++];
        }
        return arrNew;
    }

    public static boolean ifArrayContainsOneAndFour (int[] arr) {
        boolean checkOne = false;
        boolean checkFour = false;
        for (int value : arr) {
            if (value == 1) {
                checkOne = true;
            }
        }
        for (int value : arr) {
            if (value == 4) {
                checkFour = true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (checkOne && checkFour == true) {
                return true;
            }
        }
        return false;
    }

}
