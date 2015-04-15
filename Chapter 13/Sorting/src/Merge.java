import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) throws FileNotFoundException {
        int[] gpas = new int[50];

        Scanner file = new Scanner(new File("gpas.txt"));

        int i = 0;
        while (file.hasNextDouble()) gpas[i++] = file.nextInt();

        System.out.println(Arrays.toString(gpas));
        System.out.println();

        mergeSort(gpas);

        System.out.println(Arrays.toString(gpas));

    }

    public static void mergeSort(int[] values) {
        if (values.length > 1) {
            int[] left = Arrays.copyOfRange(values, 0, values.length / 2);
            int[] right = Arrays.copyOfRange(values, values.length / 2, values.length);
            mergeSort(left);
            mergeSort(right);
            merge(values, left, right);
        }
    }

    public static void merge(int[] output, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < output.length; i++) {
            if (rightIndex >= right.length || (leftIndex < left.length && left[leftIndex] <= right[rightIndex])) {
                output[i] = left[leftIndex];
                leftIndex++;
            } else {
                output[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }
}
