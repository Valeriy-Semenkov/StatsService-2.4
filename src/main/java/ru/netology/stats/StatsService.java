package ru.netology.stats;

public class StatsService {

    public int calculateAllSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverageAmount(int[] sales) {
        int averageAmount = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            averageAmount = sum / sales.length;
        }
        return averageAmount;
    }

    public int calculateNumberMonthMaxSum(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (currentMax <= sale) {
                currentMax = sale;
            }
            return currentMax;
        }
        int monthNumber = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale == currentMax) {
                monthNumber++;
            }
        }
        return month;
    }

    public int calculateNumberMonthMinSum(int[] sales) {
        int month = 0;
        int min = sales[0];
        for (int i = 0; i<sales.length; i++) {
            if (sales[i] <= min)  month = i+1;{
            }
        }
        return month;
    }

    public int calculateMonthMaxAverageAmount(int[] sales) {
        int averageAmount=15;
        int monthMax = 0;
        for (int sale : sales) {
            if (sale < averageAmount) {
                monthMax++;
            }
        }
        return monthMax;
    }


    public int calculateMonthMinAverageAmount(int[] sales) {
        int averageAmount=15;
        int monthMin = 0;
        for (int sale : sales) {
            if (sale > averageAmount) {
                monthMin++;
            }
        }
        return monthMin;
    }

}
