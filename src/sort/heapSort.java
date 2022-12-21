package sort;

public class heapSort {

    static void createMaxHeap(int[] list, int n, int i) {

        int max = i;

        int lChild = 2 * i + 1;
        int rChild = 2 * i + 2;

        int Cache;

        if (lChild < n && list[max] < list[lChild]) {
            max = lChild;
        }
        if (rChild < n && list[max] < list[rChild]) {
            max = rChild;
        }
        if (max != i) {
            Cache = list[i];
            list[i] = list[max];
            list[max] = Cache;

            createMaxHeap(list, n, max);
        }

    }

    public static void start(int[] list) {

        int Cache;

        if (list.length <= 1) {
            return;
        }
        int n = list.length;

        for (int i = (n / 2) - 1; i >= 0; i--) {
            createMaxHeap(list, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            Cache = list[i];
            list[i] = list[0];
            list[0] = Cache;

            createMaxHeap(list, i, 0);
        }
    }
}
