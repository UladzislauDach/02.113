import java.util.Arrays;

public class application {
    public static void main(String[] args) {
        int[] a = {99, 87, -12, 87, 12, 23, -100};
        boubbleSort(a);
        getMaxFromArray(a);
    }

    public static void boubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    System.out.println(Arrays.toString(arr));


                    ///gfdgfdgdfr
                }
            }

            // System.out.println();
        }
    }

    public static int getMaxFromArray(int[] array) {
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return array[indexOfMax];
    }
}
