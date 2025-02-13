package org.nathi.com;

import org.junit.Assert;
import org.junit.Test;

public class testAdd {
    Calculator calc = new Calculator();

    @Test
    public void testTwo(){
        int num = calc.add(1,2);
        int num1 = calc.add(-1,-1);
        Assert.assertEquals(3,num);
        Assert.assertEquals(-2,num1);

    }

    @Test
    public void testMultipleNumbers(){
        int num2 = calc.add(1,2,3,4,5);
        Assert.assertEquals(15,num2);

    }
    //
    @Test
    public void testMultiplyTwoNumbers(){
        int num3 = calc.multiply(1,3);
        Assert.assertEquals(3,num3);
    }
    @Test
    public void testMultiplyMultipleNumbers(){
        int num4 = calc.multiply(1,2,3,4,5);
        Assert.assertEquals(120,num4);
    }

}
