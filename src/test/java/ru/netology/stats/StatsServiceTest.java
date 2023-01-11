package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void testSum() {

        long expected = 180;
        long actual = service.sum(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void averageMonthSales() {

        long expected = 15;
        long actual = service.average(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void maximumSales() {

        long expected = 8;
        long actual = service.maximum(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void minimumSales() {

        long expected = 9;
        long actual = service.minimumMonth(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void aboveAverageSales() {

        long expected = 5;
        long actual = service.averageSales(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {

        long expected = 5;
        long actual = service.aboveAverageSales(salesByMonth);

        assertEquals(expected, actual);
    }
}