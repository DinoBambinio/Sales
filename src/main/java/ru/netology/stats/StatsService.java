package ru.netology.stats;

public class StatsService {
    public long sum(int[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return (result);
    }

    public long average(int[] sales) {           //Средняя сумма продаж за месяц
        return (sum(sales) / sales.length);
    }

    public int maximum(int[] sales) {
        int maximumSales = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maximumSales]) {
                maximumSales = month;
            }
            month++;
        }
        return (maximumSales + 1);
    }

    public int minimumMonth(int[] sales) {
        int minimumMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minimumMonth]) {
                minimumMonth = month;
            }
            month++;
        }
        return (minimumMonth + 1);
    }

    public int averageSales(int[] sales) {
        int averageSales = 0;
        long average = average(sales);
        for (int sale : sales) {
            if (sale < average) {
                averageSales++;
            }
        }
        return (averageSales);
    }

    public int aboveAverageSales(int[] sales) {
        int aboveAverageSales = 0;
        long average = average(sales);
        for (int sale : sales) {
            if (sale > average) {
                aboveAverageSales++;
            }
        }
        return (aboveAverageSales);
    }
}