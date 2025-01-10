import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
//        Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
//        new
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(Arrays.toString(array1));
//        Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        double[] arrays2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arrays2));
//        Произвольный массив. Тип и количество данных определите сами.
//        Самостоятельно выберите способ создания массива:
//        с помощью ключевого слова или сразу заполненный элементами.
        int[] array3 = {7, 42, 15, 3, 21, 56, 33, 10, 8};
        System.out.println(Arrays.toString(array3));
//        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
//        В конце строки запятую ставить не надо.
        System.out.println("Задача №2");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrays2.length; i++) {
            System.out.print(arrays2[i]);
            if (i < arrays2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i < array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача №3");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrays2.length - 1; i >= 0; i--) {
            System.out.print(arrays2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача №4");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
                System.out.print(array1[i]);
                if (i < array1.length - 1) {
                    System.out.print(", ");

                }
            }
        }
    }
}
