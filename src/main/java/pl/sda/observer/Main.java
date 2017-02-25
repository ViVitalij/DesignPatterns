package pl.sda.observer;

import pl.sda.facade.SortFacade;

import java.util.Arrays;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * main for Observer using SortFactory and Singleton from SDA-AlgorytmyIStrukturyDanych
         */
        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);

        int[] sortedArray = sortFacade.sortUsingCountingSortThroughFacade(new int[] {32, 42, -123, 23, -244, 323});

        System.out.println(Arrays.toString(sortedArray));
    }
}
