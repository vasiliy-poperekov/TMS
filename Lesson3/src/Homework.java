import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(111);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        // тут пишем логику
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры массива ");
        if (in.hasNextInt()) {
            int indexes = in.nextInt();
            int array[] = new int[indexes];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 101);
            }
            for (int element : array) {
                System.out.println(element);
            }
        } else {
            System.out.println("Вы ввели не int");
            return;
        }

        in.close();
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        int counter = 0;
        if (ints != null && ints.length > 0) {
            for (int element : ints) {
                if (element % 2 != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику
        System.out.println("_COUNT_ программистов");
        if (count >= 0) {
            if (count%100 >= 11 && count%100 <= 14) {
                System.out.println(count + " программистов");
            } else {
                switch (count % 10) {
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        System.out.println(count + " программистов");
                        break;
                    }
                    case 1: {
                        System.out.println(count + " программист");
                        break;
                    }
                    case 2:
                    case 3:
                    case 4: {
                        System.out.println(count + " программиста");
                    }
                }
            }
        } else {
            System.out.println("Орицательного числа программистов не существует!");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("foo");
        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("bar");
        } else if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("foobar");
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        //пишем логику и выводим результат используя System.out.println
        double[][] array = new double[10][10];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Math.random();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры массива ");
        if (in.hasNextInt()) {
            int rows = in.nextInt();
            if (in.hasNextInt()) {
                int collums = in.nextInt();
                int array[][] = new int[rows][collums];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = (int) (Math.random() * 101);
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] % 3 == 0) {
                            System.out.print("+");
                        } else if (array[i][j] % 7 == 0) {
                            System.out.print("-");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы ввели не int");
                return;
            }
        } else {
            System.out.println("Вы ввели не int");
            return;
        }

        in.close();
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (i == j + 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
