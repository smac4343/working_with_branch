package src;

public class Main {
    public static void main(String[] args) {
        long[] salesData = {5, 12, 20, 8, 15, 30, 12, 18};
        SalesManager salesManager = new SalesManager(salesData);

        long maxSale = salesManager.max();
        System.out.println("The maximum sale is: " + maxSale);

        double trimmedMean = salesManager.calculateTrimmedMean();
        System.out.println("Trimmed mean: " + trimmedMean);

    }
}