import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        amebs();
        System.out.println("---------------------------");
        System.out.println(summ(5,5));
        System.out.println("---------------------------");
        treug();
        System.out.println("---------------------------");
        printerNum();
        System.out.println("---------------------------");
        printerArr12();
        System.out.println("---------------------------");
        printerArr20();
        System.out.println("---------------------------");
        reversM();
        System.out.println("---------------------------");
        checkMass();
        System.out.println("---------------------------");
        reversMatrix();
    }

    public static void amebs() {
        int count = 1;
        for (int i = 0; i <= 24; i += 3) {
            System.out.println("Прошло часов: " + i + " Колиество амёб = " + count);
            count *= 2;
        }
    }

    public static int summ(int a, int b) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += b;
        }
        return sum;
    }

    public static void treug() {
        char symbols[][] = new char[4][4];
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                symbols[i][j] = '*';
            }
        }

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                if ((i + 1) * (j + 1) >= 4) {
                    if (i + 1 == 2 && j + 1 == 2) {
                        System.out.print("  ");
                    } else {
                        System.out.print(symbols[i][j] + " ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
////////////////////////////////////////////////////////
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                if (i >= j) {
                    System.out.print(symbols[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
////////////////////////////////////////////////
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                if (j >= i) {
                    System.out.print(symbols[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
///////////////////////////////////////////////////////////////
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                if ((i + 1) * (j + 1) <= 6) {
                    System.out.print(symbols[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void summOfNumbers(int number) {
        int count = 0, numberC = number;
        while (numberC > 0) {
            count++;
            numberC /= 10;
        }
        if (number > 0) {
            System.out.println(number + " - Положительное число, кол-во цифр = " + count);
        } else if (number < 0) {
            System.out.println(number + " - Отрицательное число, кол-во цифр = " + count);
        } else {
            System.out.println("Вы ввели ноль");
        }
    }

    public static void printerNum() {
        int numbers[] = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 1;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");

        for (int i = numbers.length - 1; i > -1; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }

    public static void printerArr12() {
        Random random = new Random();
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
        }

        int max = mass[0], maxind = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= max) {
                max = mass[i];
                maxind = i;
            }
        }

        System.out.println("Maximum = " + max + " Maximum index = " + maxind);
    }

    public static void printerArr20() {
        Random random = new Random();
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length; i += 2) {
            mass[i] = 0;
        }

        System.out.println(Arrays.toString(mass));
    }

    public static void reversM() {
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};

        System.out.println(Arrays.toString(mass));

        int max = mass[0], maxind = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= max) {
                max = mass[i];
                maxind = i;
            }
        }

        int bufferNum;
        bufferNum = mass[0];
        mass[0] = mass[maxind];
        mass[maxind] = bufferNum;

        System.out.println(Arrays.toString(mass));
    }

    public static void checkMass()
    {
        int[] array  = {0,5,46,3,6,1,2};
        boolean flag = true;
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                if (array[i] == array[j] && flag) {
                    System.out.print("Массив имеет повторяющиеся элементы " + array[i]);
                    flag=false;
                } else if (array[i] == array[j])
                {
                    System.out.print(" "+array[i]);
                }
            }
        }
        if(flag)
        {
            System.out.println("Массив не имеет повторяющихся элементов ");
        }
    }

    public static void reversMatrix() {
        int size;
        Scanner scanner = new Scanner(System.in);
        Random randomizer = new Random();

        System.out.println("Введите размер массива ");
        size = scanner.nextInt();
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = randomizer.nextInt(50);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}