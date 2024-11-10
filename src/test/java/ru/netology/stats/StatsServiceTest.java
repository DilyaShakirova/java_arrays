package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findAmountOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long amountOfSales = service.amountSales(sales);
        long expectedAmount = 180;
        Assertions.assertEquals(expectedAmount, amountOfSales);
    }
    @Test
    public void findAverageSale(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long averageSale = service.averageSale(sales);
        long expectedAverageSale = 15;
        Assertions.assertEquals(expectedAverageSale, averageSale);
    }
    @Test
    public void findMonthWithMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMonth = service.maxSales(sales);
        long expectedMonth = 8;
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
  @Test
    public void findMonthWithMinSale() {
      StatsService service = new StatsService();
      long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      long actualMonth = service.minSales(sales);
      long expectedMonth = 9;
      Assertions.assertEquals(expectedMonth, actualMonth);
    }

   @Test
    public void findNumberOfMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualNumber = service.belowAverage(sales);
        long expectedNumber = 5;
        Assertions.assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void findNumberOfMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualNumber = service.aboveAverage(sales);
        long expectedAverageSale = 5;
        Assertions.assertEquals(expectedAverageSale,actualNumber);
    }
    }
