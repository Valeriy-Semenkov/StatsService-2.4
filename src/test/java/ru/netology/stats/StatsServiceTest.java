package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test

    void calculateAllSum() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateAllSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateAverageAmount() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateNumberMonthMaxSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateNumberMonthMaxSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateNumberMonthMinSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateNumberMonthMinSum(sales);

        Assertions.assertEquals(expected, actual);


    }
    @Test
    void calculateMonthMaxAverageAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthMaxAverageAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateMonthMinAverageAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthMinAverageAmount(sales);

        Assertions.assertEquals(expected, actual);

    }
}