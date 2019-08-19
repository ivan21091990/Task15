package com.itProger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива и нажмите Enter:");
        int x = scanner.nextInt();
        int array[] = new int[x];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i+1) + "-е число в массив: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int number1 = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int number2 = array[j];

                if (number1 < number2) {
                    array[j + 1] = number2;
                    array[j] = number1;
                } else {
                    break;
                }
            }
        }
        String intArrayString = Arrays.toString(array);

        System.out.println("Вывод чисел по возрастанию: " + intArrayString);

        }
    }
