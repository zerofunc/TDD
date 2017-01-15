package Section;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YooHyeongJu on 2017-01-16.
 */
public class s1 {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
