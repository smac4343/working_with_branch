package src;
import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public double calculateTrimmedMean() {
        // Сортируем массив чисел
        Arrays.sort(sales);

        // Удаляем первый и последний элементы массива (минимальное и максимальное значения)
        int[] trimmedNumbers = Arrays.copyOfRange(sales, 1, sales.length - 1);

        // Вычисляем среднее значение массива, отбросив минимальное и максимальное значения
        return Arrays.stream(trimmedNumbers).average().orElse(0);
    }
}