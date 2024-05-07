package org.etutoria.demojenkins;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    private int sum(int a, int b) {
        return a + b;
    }

    @Test
    public void testSumSuccess() {
        Assert.assertEquals(5, sum(2, 3));
    }

    @Test
    public void testSumFailure() {
        Assert.assertEquals(6, sum(2, 3));
    }
}