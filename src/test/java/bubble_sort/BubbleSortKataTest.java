package bubble_sort;

import bubble_sort.BubbleSortKata;
import org.junit.Assert;
import org.junit.Test;

public class
BubbleSortKataTest {
    // Sort the array of integers smallest to largest without using the sort() method

    @Test
    public void sortIntegerArrayTest() {
        int[] intArray = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedIntArray = BubbleSortKata.sortIntegerArray(intArray);

        Assert.assertArrayEquals(new int[] {11,12,22,25,34,64,90}, sortedIntArray);
    }
}
