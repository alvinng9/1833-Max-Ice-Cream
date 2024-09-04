package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxIceCreamTest() {
        Solution solution = new Solution();
        assertEquals(4, solution.maxIceCream(new int[]{1,3,2,4,1}, 7));
        assertEquals(0, solution.maxIceCream(new int[]{10,6,8,7,7,8}, 5));
        assertEquals(6, solution.maxIceCream(new int[]{1,6,3,1,2,5}, 20));
    }
}