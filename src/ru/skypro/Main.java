package ru.skypro;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[30];
        generateRandomArray(arr);
         calculateAverageAmountSpendingMonth(arr,calculateAmountExpensesMonth(arr));

    }
        public static int calculateAmountExpensesMonth (int [] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
            return sum;
        }


    public static long  calculateAverageAmountSpendingMonth (int []arr, int sum) {
        long averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            averageSum = (long) sum / arr.length;
        }System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");
        return averageSum;
    }


    public static int[] generateRandomArray(int [] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}