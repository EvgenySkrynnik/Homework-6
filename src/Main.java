import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("задача 1 ");
        /*Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
         Массив сразу заполните значениями.
         */
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers1 = {1.57, 7.654, 9.986};
        char[] numbers2 = {'a', 'b', 'c', 'd', 'e'};
    }

    public static void task2() {
        System.out.println("задача 2 ");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        int[] numbers = {1, 2, 3};
        double[] numbers1 = {1.57, 7.654, 9.986};
        char[] numbers2 = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]);
            if (i != numbers1.length - 1) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i != numbers2.length - 1) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("задача 3 ");
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        // В конце строки запятую ставить не надо.
        int[] numbers = {1, 2, 3};
        double[] numbers1 = {1.57, 7.654, 9.986};
        char[] numbers2 = {'a', 'b', 'c', 'd', 'e'};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("задача 4 ");
//Пройдитесь по первому целочисленному массиву
// и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                arr[i]+=1;
                System.out.println(Arrays.toString(arr ));


            }
        }

    }
}
