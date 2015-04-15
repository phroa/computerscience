//Write a program that reads a series of input lines and sorts them into alphabetical order, ignoring the case of words.
//The program should use the merge sort algorithm so that it efficiently sorts even a large file.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<String>() {{
            Scanner doge = new Scanner(new File("names.txt"));
            while (doge.hasNextLine()) add(doge.nextLine());
        }};

        String[] strings = names.toArray(new String[names.size()]);

        startSorting(strings);

        for (String s : strings) System.out.println(s);

    }

    private static void startSorting(String[] a) {
        String[] copy = a.clone();
        mergeSort(copy, a, 0, a.length, 0);
    }

    private static void mergeSort(String[] src, String[] dest, int low, int high, int off) {
        int length = high - low;
        if (length < 7) {
            for (int i=low; i<high; i++)
                for (int j=i; j>low && (dest[j-1]).compareTo(dest[j])>0; j--) {
                    String t = dest[j];
                    dest[j] = dest[j-1];
                    dest[j-1] = t;
                }
            return;
        }
        int destLow  = low;
        int destHigh = high;
        low  += off;
        high += off;
        int mid = (low + high) / 2;
        mergeSort(dest, src, low, mid, -off);
        mergeSort(dest, src, mid, high, -off);
        if (src[mid-1].compareTo(src[mid]) <= 0) {
            System.arraycopy(src, low, dest, destLow, length);
            return;
        }

        for(int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && (src[p]).compareTo(src[q])<=0)
                dest[i] = src[p++];
            else
                dest[i] = src[q++];
        }
    }

}