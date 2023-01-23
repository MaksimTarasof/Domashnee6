package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test //1

    public void shouldFindAllSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.allSales(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test //2

    public void shouldFindAverageSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSales(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test //3

    public void shouldFindMaxMounth() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test //4

    public void shouldFindBetweenEnds() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test //5

    public void lowAwg() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.belTheAverageSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test //6

    public void hoghAwg() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.belowTheAverageSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
