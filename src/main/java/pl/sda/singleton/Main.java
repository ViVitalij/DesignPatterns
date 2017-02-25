package pl.sda.singleton;

import algorithms.sort.Sort;
import algorithms.sort.factory.SortFactory;

import java.util.Arrays;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getName());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.getName());

        /**
         * main for Singleton SortFactory from SDA-AlgorytmyIStrukturyDanych
         */
        SortFactory factory = SortFactory.getInstance();

        Sort sort = factory.produce(Sort.sortEnum.BUBBLE);

        int[] sortedArray = sort.ascSort(new int[] {32, 42, -123, 23, -244, 323});
        System.out.println(Arrays.toString(sortedArray));
    }
}
