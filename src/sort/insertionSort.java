package sort;

public class insertionSort {
    public static void start(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int value = list[i];
            int j = i;
            for(; j > 0 && list[j-1] > value; j--) {
                list[j - 1] = list[j];
            }
            list[j] = value;
        }
    }
}