import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0, 4, 5, 0, 15, 0, 14};
        int[] array2 = {1, 5, 3, 0, 0, 4};
        int[] array3 = new int[array.length + array2.length];
        // сделать единый массив из array и array2, но без 0
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }
        int count = 0;
        for (int i = array.length; i < array3.length; i++) {
            array3[i] = array2[count++];
        }
        System.out.println(Arrays.toString(array3));

        int nol = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == 0) {
                nol++;
            }
        }
        int[] array1 = new int[array3.length - nol];
        int temp = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] != 0) {
                array1[temp++] = array3[i]; //
            }
        }
//        // {1, 2, 3, 0, 4, 5, 0, 15, 0, 14}
//        // {1, 2, 3, 4, 5, 15, 14}
//        // temp = 1, temp = 2, temp = 3, temp = 4, temp = 5, temp = 6, temp = 7
        System.out.println("Единый массив array и array2 без 0: " + Arrays.toString(array1)); // {1, 2, 3, 4, 5, 15, 14}


    }
}
