package pl.sda.facade;


import java.util.Arrays;

/**
 * Created by m.losK on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {

        int[] arrayToSort = {4, 5, -2, 6, -2, -1, 9, 10};
        SortFacade sort = new SortFacade();
        int[] result = sort.sortThroughFacade(arrayToSort);
        System.out.println(Arrays.toString(result));
    }
}
