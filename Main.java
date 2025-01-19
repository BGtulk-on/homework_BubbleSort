import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main{

    public static void main(String[] args) {
        int[] array = generateRandomArray(20, 1, 100);

        System.out.println("Оригинален Array:");
        printArray(array);

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        separateEvenAndOdd(array, evenList, oddList);

        System.out.println("\nЧетни:");
        System.out.println(evenList);
        System.out.println("Нечетни:");
        System.out.println(oddList);

        bubbleSortDescending(oddList);
        bubbleSortAscending(evenList);



        System.out.println("\nСортирани на четни елементи по възходящ ред:");
        System.out.println(evenList);
        System.out.println("Сортирани нечетни елементи в низходящ ред:");
        System.out.println(oddList);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void separateEvenAndOdd(int[] array, List<Integer> evenList, List<Integer> oddList) {
        for (int num : array) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
    }

    public static void bubbleSortAscending(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortDescending(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }














    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}