package sort;

public class quickSort {
    static int sort(int[] list, int low, int high) {
        int pivot = list[high];
        int lowCache = low;
        int highCache = high;
        int Cache;
        while (low < high) {
            while (high > lowCache && list[high] >= pivot) {
                high--;
            }
            while (low < highCache && list[low] < pivot) {
                low++;
            }
            if (low < high) {
                Cache = list[low];
                list[low] = list[high];
                list[high] = Cache;
            }
        }
        if (list[low] > pivot) {
            Cache = list[low];
            list[low] = list[highCache];
            list[highCache] = Cache;
        }
        return low;
    }

    public static void start(int[] list, int low, int high) {
        if (low < high) {
            int pivot = sort(list, low, high);
            start(list, pivot + 1, high);
            start(list, low, pivot - 1);
        }
    }
}
