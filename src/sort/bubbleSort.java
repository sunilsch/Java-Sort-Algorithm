package sort;

public class bubbleSort {
    public static void start(int[] list) {
        int Cache;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    Cache = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = Cache;
                }
            }
        }
    }
}
