package Tests;

import org.junit.Test;

public class Test_Cases {

    /**
     * This tests the result of an array with 4 numbers. It should fail.
     */

    @Test
    public void  findMaxNumber4()  {
        int [] arr1 = {1,1,5,6};
        int n = arr1.length;
        int max = 5;
        int highestFreqResult = com.company.Main.mostFrequent(arr1, n);

        assert highestFreqResult == max;
    }

    /**
     * This tests result of an array with 10 numbers
     */

    @Test
    public void findMaxNumber10() {
        int [] arr2 = {5,5,5,5,6,7,8,9,10,11};
        int n = arr2.length;
        int max = 5;
        int highestFreqResult = com.company.Main.mostFrequent(arr2, n);

        assert highestFreqResult == max;
    }

    /**
     * This tests the result of an array with same frequency for all numbers
     * Code should return lowest Number in Array
     */

    @Test
    public void maxNumberNotPresent() {
        int [] arr3 = {8,9,7,6};
        int n = arr3.length;
        int max = 6;
        int highestFreqResult = com.company.Main.mostFrequent(arr3, n);

        assert highestFreqResult == max;
    }

    /**
     * This tests the result of an empty array
     */

    @Test
    public void emptyArray () {
        int [] arr4 = {};
        int n = arr4.length;
        int max = -1;
        int highestFreqResult = com.company.Main.mostFrequent(arr4, n);

        assert highestFreqResult == max;
    }

    /**
     * This tests the result of an array with 4 digit numbers
     */

    @Test
    public void fourDigitNumbers () {
        int [] arr5 = {4000, 4000, 1000, 9000, 4000, 1000};
        int n = arr5.length;
        int max = 4000;
        int highestFreqResult = com.company.Main.mostFrequent(arr5, n);

        assert highestFreqResult == max;
    }
}
