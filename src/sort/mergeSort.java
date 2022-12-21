package sort;

public class mergeSort {

    static void merge(int[] list, int l, int m, int r) {
        int r_first = m + 1;
        int l_cache = l;
        int[] out_list = new int[r - l + 1];
        for (int i = 0; i < out_list.length; i++) {
            if (l > m) {
                out_list[i] = list[r_first];
                r_first++;
            } else if (r_first > r) {
                out_list[i] = list[l];
                l++;
            } else if (list[l] < list[r_first]) {
                out_list[i] = list[l];
                l++;
            } else if (list[l] >= list[r_first]) {
                out_list[i] = list[r_first];
                r_first++;
            }
        }
        for (int i = 0; i < out_list.length; i++) {
            list[i + l_cache] = out_list[i];
        }
    }

    public static void start(int[] list, int l, int r) {

        if (l < r) {
            int m = (l + r - 1) / 2;
            start(list, l, m);
            start(list, m + 1, r);
            merge(list, l, m, r);
        }
    }
}
