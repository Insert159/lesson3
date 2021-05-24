package ru.geekbrains.lesson3;


import java.util.Arrays;

public class homeworck3 {
    public static void main(String args[]) {
        integerArray();
        array();
        lessThan6Times2();
        diagOne();
//        task5(-1, -1);
        minAndMaxToArray();
        checkBalance( 5,5,6,8,8,0);
    }



    public static void integerArray() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else numbers[i] = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

        public static void array () {
            int[] numbers = new int[101];
            for (int i = 1; i < 101; i++) {
                numbers[i] = i;
                System.out.println(numbers[i]);

            }
        }
        public static void lessThan6Times2 () {
            int[] numb = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < numb.length; i++) {
                if (numb[i] < 6) numb[i] = numb[i] * 2;
            }
            System.out.println(Arrays.toString(numb));
        }

        public static void diagOne () {
            int[][] arr = new int[6][6];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

//    public static int[] task5(int initialValue, int len) {
//        int[] array = new int[len];
//        if (len < 0) {
//            return int[0];
//        }
//        for (int i = 0; i < len; i++)
//            array[] = initialValue;
//        return array;
//    }



    public static void minAndMaxToArray() {
        int [] array = {17, 19, 14, 5, 24, 100};
        int max = array[0];
        int min = array[0];
        for(int i = 0; i != array.length; i ++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min + " " + max);
    }
        public static boolean checkBalance(int[] array){
            int leftSum = 0;
            for(int i = 0; i < array.length; i++){
                leftSum += array[i];
                int rightSum = 0;
                for (int j = 0; j < array.length; j++){
                    rightSum += (j > i)? array[j] : 0;
        }
                if(leftSum == rightSum){
            return true;
        }
    }
    return false;
}
}