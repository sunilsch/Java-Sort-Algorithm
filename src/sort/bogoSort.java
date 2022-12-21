package sort;

import java.util.Random;

public class bogoSort {
    static boolean isSorted(int[] list){
        for(int i = 1; i < list.length; i++){
            if(list[i] < list[i -1]){
                return false;
            }
        }
        return true;
    }

    static void shuffle(int[] list){

        Random random = new Random();

        int a = random.nextInt(list.length);
        int b = random.nextInt(list.length);

        int Cache = list[a];
        list[a] = list[b];
        list[b] = Cache;
    }

    public static void start(int[] list){
        while(!isSorted(list))
            shuffle(list);
    }
}