package sort;

public class countingSort {
    public static void start(int[] list) {
        int max = -1;
        for (int k : list) {
            if (k > max) {
                max = k;
            }
        }
        int[] countingList = new int[max + 1];
        for (int j : list) {
            countingList[j]++;
        }
        for (int i = 1; i < countingList.length; i++) {
            countingList[i] += countingList[i - 1];
        }
        int[] finalList = new int[list.length + 1];
        for (int j : list) {
            finalList[countingList[j]] = j;
            countingList[j]--;
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = finalList[i];
        }
    }
}
