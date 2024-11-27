package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSumAfterPartitioningTest {

    @Test
    public void testMaxSumAfterPartitioning() {
        // Test case 1
        int[] num1 = {1, 15, 7, 9, 2, 5, 10};
        int k1 = 3;
        int expected1 = 84;
        assertEquals(expected1, MaxSumAfterPartitioning.maxSumAfterPartitioning(num1, k1));


    }
}

