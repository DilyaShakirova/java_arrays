package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public long amountSales(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount;
    }

    //средние продажи
    public long averageSale(long[] sales) {
        long average;
        average = amountSales(sales) / (sales.length);
        return average;
    }

    //месяц максимальных продаж
    public int maxSales(long[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    //месяц минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //количество месяцев с продажами ниже среднего
    public int belowAverage(long[] sales) {
        int belowAverageMonths = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                belowAverageMonths = belowAverageMonths + 1;
            }
        }
        return belowAverageMonths;
    }

    //количество месяцев с продажами выше среднего
    public int aboveAverage(long[] sales) {
        int aboveAverageMonths = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                aboveAverageMonths = aboveAverageMonths + 1;
            }
        }
        return aboveAverageMonths;
    }
}
