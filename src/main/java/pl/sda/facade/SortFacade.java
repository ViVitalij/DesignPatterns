package pl.sda.facade;

import algorithms.sort.Sort;
import algorithms.sort.impl.CountingSort;
import algorithms.sort.impl.SelectionSort;
import pl.sda.observer.Observer;

/**
 * Created by m.losK on 2017-02-25.
 */
public class SortFacade {

    private Observer observer;

    public SortFacade() {
    }

    public SortFacade(Observer observer) {
        this.observer = observer;
    }

    public int[] sortThroughFacade(int[] arrayToSort) {
        Sort sort = new SelectionSort();
        return sort.ascSort(arrayToSort);
    }

    public int[] sortUsingCountingSortThroughFacade(int[] arrayToSort) {
        Sort sort = new CountingSort();
        for (int i = 0; i < arrayToSort.length; i++) {
            if (arrayToSort[i] < 0 && observer != null) {
                int tempValue = arrayToSort[i];
                arrayToSort[i] = Math.abs(arrayToSort[i]);
                observer.react(tempValue);
            }
        }
        return sort.ascSort(arrayToSort);
    }
}
