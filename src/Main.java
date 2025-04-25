import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1:

        int[] accountingBook = {1000, 2000, 3000, 4000, 5000};
        int sum = 0;
        for (int i = 0; i < accountingBook.length; i++) { // решение через стандартный цикл for
            sum += accountingBook[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2:

        int[] accountingBook2 = {14000, 12000, 10000, 13000, 15000};
        int max = -1;
        int min = 100_000;
        for (int i = 0; i < accountingBook2.length; i++) { // решение через стандартный цикл for
            if (accountingBook2[i] > max) {
                max = accountingBook2[i];
            }
        }
        for (int i = 0; i < accountingBook2.length; i++) { // решение через стандартный цикл for
            if (accountingBook2[i] < min) {
                min = accountingBook2[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей", min, max);

        // Задача 2: решение через сортировку массива

        System.out.println();

        int[] accountingBookSorted = {14000, 12000, 10000, 13000, 15000};
        Arrays.sort(accountingBookSorted);
//        System.out.println(Arrays.toString(accountingBookSorted)); // проверка что сортировка сработала
        max = accountingBookSorted[accountingBookSorted.length - 1];
        min = accountingBookSorted[0];
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей", min, max);

        // Задача 3:

        System.out.println();

        int[] accountingBookAverage = {2215, 326, 12400, 16100, 3456};
        sum = 0;
        int weekNum = 4;
        double averageWeekExpenses = 0.0;
        for (int expenses : accountingBookAverage) { // цикл for each
            sum += expenses;
        }
        averageWeekExpenses = (double) sum / weekNum;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageWeekExpenses);

        // Задача 4:

        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp = 0; // ввожу дополнительную переменную для временного хранения значения
        int leftOrder = 0;
        int rightOrder = reverseFullName.length - 1;
        while (leftOrder < rightOrder) {
            temp = reverseFullName[leftOrder];
            reverseFullName[leftOrder] = reverseFullName[rightOrder];
            reverseFullName[rightOrder] = temp;
            leftOrder++;
            rightOrder--;
        }
        System.out.println(reverseFullName);
    }
}
