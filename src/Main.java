import sort.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static String[] methods = {"all (without bogoSort)", "quickSort", "selectionSort", "insertionSort", "bubbleSort", "mergeSort", "heapSort", "countingSort", "bogoSort (randomSort)"};

    static Scanner scanner = new Scanner(System.in);

    public static void execute(int methodIndex, int[] list) {
        long start;
        long stop;

        int[] listCopy;

        String method = methods[methodIndex];

        listCopy = Arrays.copyOf(list, list.length);

        start = System.currentTimeMillis();

        switch (methodIndex) {
            case 1 -> quickSort.start(listCopy, 0, list.length - 1);
            case 2 -> selectionSort.start(listCopy);
            case 3 -> insertionSort.start(listCopy);
            case 4 -> bubbleSort.start(listCopy);
            case 5 -> mergeSort.start(listCopy, 0, list.length - 1);
            case 6 -> heapSort.start(listCopy);
            case 7 -> countingSort.start(listCopy);
            case 8 -> bogoSort.start(listCopy);
        }

        stop = System.currentTimeMillis();

        System.out.println(method);
        System.out.println("time  " + (stop - start));
        for (int i = 1; i < list.length; i++) {
            if (listCopy[i] < listCopy[i - 1]) {
                System.out.println("Error while sorting!");
                System.out.println("Wrong array from " + method + " : " + Arrays.toString(listCopy));
                return;
            }
        }

        System.out.println("Correct");
    }

    public static int[] getRandom() {

        Random random = new Random();

        System.out.println("How many items do you want to sort?");
        int length = scanner.nextInt();

        int[] list = new int[length];

        for (int i = 0; i < length; i++) {
            list[i] = random.nextInt(9999999);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] list = getRandom();

        boolean end = false;
        int method;
        int answer;

        while (!end) {
            for (int i = 0; i < methods.length; i++) {
                System.out.println(i + " " + methods[i]);
            }
            System.out.println("Which Method do you want?");
            method = scanner.nextInt();

            if (method == 0) {
                for (method = 1; method < methods.length - 1; method++) {
                    execute(method, list);
                }
            } else {
                execute(method, list);
            }
            System.out.println("1 : Same Number\n2 : Change Number\n3: end");
            answer = scanner.nextInt();
            if (answer == 2) {
                list = getRandom();
            } else if (answer == 3) {
                end = true;
            }
        }
    }
}