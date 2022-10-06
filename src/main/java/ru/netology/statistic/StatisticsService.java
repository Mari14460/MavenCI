package ru.netology.statistic;

public class StatisticsService
{
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) { //{1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long current_max_index = 0;
        long current_max = incomes[0]; //1
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }
}
