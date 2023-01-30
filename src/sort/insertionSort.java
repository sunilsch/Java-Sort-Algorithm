package sort;

public class insertionSort {
    public static void start(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int value = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > value) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = value;
        }
    }
}