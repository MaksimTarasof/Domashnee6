package ru.netology.stats;

public class StatsService {
    //1 Сумма всех продаж
    public int allSales(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //2 Средняя сумма продаж в месяц
    public int averageSales(int[] sales) {

        double sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return (int) (sum / sales.length);
    }

    //3 Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5 Количество месяцев, в которых продажи были ниже среднего
    public int belTheAverageSales(int[] sales) {

        int month = 0;

        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                month++;
            }

        }
        return month;
    }
    //6 Количество месяцев, в которых продажи были выше среднего
    public int belowTheAverageSales(int[] sales) {

        int month = 0;

        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                month++;
            }

        }
        return month;
    }

}

