package test;

import org.junit.Assert;
import org.junit.Test;
import main.ThirtySecondsFormatter;
import static org.junit.Assert.*;


public class ThirtySecondsFormatterTest {


	@Test
    public void FormatQuoteTest(){
        Assert.assertEquals(ThirtySecondsFormatter.convertToString(105.25d), "105-08");
        Assert.assertEquals(ThirtySecondsFormatter.convertToString(9.125d), "09-04");
        Assert.assertEquals(ThirtySecondsFormatter.convertToString(25.15625d),"25-05");
        Assert.assertEquals(ThirtySecondsFormatter.convertToString(30.1875d),"30-06");
        Assert.assertEquals(ThirtySecondsFormatter.convertToString(6.46875d), "06-15");


    }

}
