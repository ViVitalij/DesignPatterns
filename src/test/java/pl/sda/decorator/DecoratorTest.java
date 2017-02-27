package pl.sda.decorator;

import algorithms.sort.impl.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by m.losK on 2017-02-27.
 */
public class DecoratorTest {

    @Test
    public void testDecoratorAscSort() {
        //given
        int[] arrayToSort = {55, 33, 71, -33, -2, 4, 99, 12};
        SortDecoratorWithReverse decoratedSort = new SortDecoratorWithReverse(new BubbleSort());

        //when
        int[] result = decoratedSort.ascSort(arrayToSort);

        //then
        Assert.assertEquals(99, result[0]);
        Assert.assertEquals(71, result[1]);
        Assert.assertEquals(-33, result[arrayToSort.length - 1]);
    }
}
