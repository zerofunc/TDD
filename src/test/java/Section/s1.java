package Section;

import Section.section1.Dollar;
import Section.section1.Franc;
import Section.section1.Money;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by YooHyeongJu on 2017-01-16.
 */
public class s1 {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue((Money.dollar(5).equals((Money.dollar(5)))));
        assertFalse((Money.dollar(5).equals((Money.dollar(6)))));
        assertTrue((new Franc(5).equals((new Franc(5)))));
        assertFalse((new Franc(5).equals((Money.dollar(5)))));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
