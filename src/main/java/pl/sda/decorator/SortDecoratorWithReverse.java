package pl.sda.decorator;

import algorithms.sort.Sort;

/**
 * Created by m.losK on 2017-02-27.
 */
public class SortDecoratorWithReverse implements Sort {
    private Sort sort;

    public SortDecoratorWithReverse(Sort sort) {
        this.sort = sort;
    }

    @Override
    public int[] ascSort(int[] arrayToSort) {
        int[] result = sort.ascSort(arrayToSort);
        int[] reversedResult = new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            reversedResult[i] = result[arrayToSort.length - i - 1];
        }
        return reversedResult;
    }

    @Override
    public int[] descSort(int[] arrayToSort) {
        int[] result = sort.descSort(arrayToSort);
        int[] reversedResult = new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            reversedResult[i] = result[arrayToSort.length - i - 1];
        }
        return reversedResult;
    }
}
