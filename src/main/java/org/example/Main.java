package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void drawLine(int length, String direction, char symbol) {
        if (direction.equals("horizontal")) {

            for (int i = 0; i < length; i++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        } else if (direction.equals("vertical")) {
            // Вертикальна лінія
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Некоректний напрямок. Виберіть 'horizontal' або 'vertical'.");
        }
    }


    public static void sortArrayAscending(int[] array) {
        Arrays.sort(array);
    }


    public static void sortArrayDescending(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        // task 1
        String text = "“Your time is limited, \n\tso don’t waste it\n\t\tliving someone else’s life”\n\t\t\tSteve Jobs";
        System.out.println(text);
        // task2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число:");
        double number = scanner.nextDouble();

        System.out.println("Введіть відсоток:");
        double percent = scanner.nextDouble();

        double result = (percent / 100) * number;

        System.out.println(percent + "% від " + number + " = " + result);

        // task 3

        System.out.println("Введіть перше число:");
        int number1 = scanner.nextInt();

        System.out.println("Введіть друге число:");
        int number2 = scanner.nextInt();

        System.out.println("Введіть третє число:");
        int number3 = scanner.nextInt();

        int resultNumber = number1 * 100 + number2 * 10 + number3;

        System.out.println("Число, що містить ці числа: " + resultNumber);

        // task 4
        int numberl = scanner.nextInt();

        if (numberl < 100000 || numberl > 999999) {
            System.out.println("Введене число не є шестизначним.");
        } else {
            int digit1 = numberl / 100000;
            int digit2 = (numberl / 10000) % 10;
            int digit3 = (numberl / 1000) % 10;
            int digit4 = (numberl / 100) % 10;
            int digit5 = (numberl / 10) % 10;
            int digit6 = numberl % 10;

            int newNumber = digit6 * 100000 + digit5 * 10000 + digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;

            System.out.println("Отримане число зі зміненими парами цифр: " + newNumber);
        }
        // task 5
        System.out.println("Введіть номер місяця (1-12):");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Помилка: неправильно введений номер місяця.");
                break;
        }
        // task 6
        System.out.println("Введіть кількість метрів:");
        double meters = scanner.nextDouble();

        System.out.println("Оберіть одиницю виміру для переведення:");
        System.out.println("1. Милі");
        System.out.println("2. Дюйми");
        System.out.println("3. Ярди");
        int choice = scanner.nextInt();

        double resultat = 0;

        switch (choice) {
            case 1:

                resultat = meters * 0.000621371;
                System.out.println("Результат: " + resultat + " милі");
                break;
            case 2:

                resultat = meters * 39.3701;
                System.out.println("Результат: " + resultat + " дюйми");
                break;
            case 3:

                resultat = meters * 1.09361;
                System.out.println("Результат: " + resultat + " ярди");
                break;
            default:
                System.out.println("Неправильний вибір.");
                break;
        }
        // task 7
        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Непарні числа в діапазоні [" + num1 + ", " + num2 + "]:");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // task 8

        System.out.println("Введіть початкове число:");
        int start = scanner.nextInt();
        System.out.println("Введіть кінцеве число:");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Початкове число має бути менше або рівне кінцевому числу.");
            return;
        }

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
        // task 9
        int[] array = generateRandomArray(10, -50, 50);


        System.out.println("Масив:");
        printArray(array);


        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }


        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int num : array) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }


        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Кількість від'ємних чисел: " + negativeCount);
        System.out.println("Кількість додатніх чисел: " + positiveCount);
        System.out.println("Кількість нулів: " + zeroCount);

        // task 10
        int[] arraytaskten = generateRandomArray(10, -50, 50);


        System.out.println("Масив:");
        for (int num : arraytaskten) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] evenArray = new int[arraytaskten.length];
        int[] oddArray = new int[arraytaskten.length];
        int[] negativeArray = new int[arraytaskten.length];
        int[] positiveArray = new int[arraytaskten.length];
        int evenIndex = 0, oddIndex = 0, negativeIndex = 0, positiveIndex = 0;

        for (int num : arraytaskten) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }

            if (num < 0) {
                negativeArray[negativeIndex++] = num;
            } else if (num > 0) {
                positiveArray[positiveIndex++] = num;
            }
        }


        System.out.println("\nПарні числа:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println("\nНепарні числа:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println("\nВід'ємні числа:");
        for (int i = 0; i < negativeIndex; i++) {
            System.out.print(negativeArray[i] + " ");
        }
        System.out.println("\nДодатні числа:");
        for (int i = 0; i < positiveIndex; i++) {
            System.out.print(positiveArray[i] + " ");
        }
        // task 11
        drawLine(10, "horizontal", '*');
        drawLine(5, "vertical", '-');
        // task 12

        // Введення розміру масиву
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();


        int[] array12 = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array12[i] = scanner.nextInt();
        }


        System.out.println("Виберіть напрям сортування: ");
        System.out.println("1. Зростання");
        System.out.println("2. Спадання");
        int choice12 = scanner.nextInt();


        if (choice12 == 1) {
            sortArrayAscending(array);
        } else if (choice12 == 2) {
            sortArrayDescending(array);
        } else {
            System.out.println("Некоректний вибір.");
            return;
        }


        System.out.println("Відсортований масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
