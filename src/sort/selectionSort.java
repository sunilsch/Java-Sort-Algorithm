package sort;


public class selectionSort {
    public static void start(int[] list) {
        for (int index = 0; index < list.length; index++) {
            int minimumIndex = index;
            for (int i = index + 1; i < list.length; i++) {
                if (list[minimumIndex] > list[i]) {
                    minimumIndex = i;
                }
            }
            int Cache = list[minimumIndex];
            list[minimumIndex] = list[index];
            list[index] = Cache;
        }
    }
}
