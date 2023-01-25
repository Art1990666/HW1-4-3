import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("HW-1!");
        int[] money = generateRandomArray();
        System.out.println(Arrays.toString(money));
        int salary = 0;
        for (int i = 0; i < money.length; i++) {
            salary = salary + money[i];
        }
        System.out.println(" Сумма трат за месяц составила " + salary + " рублей ");
    }

    public static void task2() {
        System.out.println("HW-2!");
        int[] money = generateRandomArray();
        int max = money[0];
        int min = money[0];
        for (int i = 0; i < money.length; i++) {
            if (money[i] > max) {
                max = money[i];
            }
            if (money[i] < min) {
                min = money[i];
            }
        }
        System.out.println(" Минимальная сумма трат за день составила " + min + " рублей." +
                " Максимальная сумма трат за день составила " + max + " рублей ");
    }
    public static void task3() {
        System.out.println("HW-3!");
        int[] money = generateRandomArray();
        System.out.println(Arrays.toString(money));
        int oll = 0;
        int payment = 30;
        for (int i = 0; i < money.length; i++) {
            oll = oll + money[i];
        }
        System.out.println(" Средняя сумма трат за месяц составила " + (double) oll / payment + " рублей ");
    }
    public static void task4() {
        System.out.println("HW-4!");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }


    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}