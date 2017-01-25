package Section;

import Section.section1.Dollar;
import Section.section1.Franc;
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
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue((new Dollar(5).equals((new Dollar(5)))));
        assertFalse((new Dollar(5).equals((new Dollar(6)))));
        assertTrue((new Franc(5).equals((new Franc(5)))));
        assertFalse((new Franc(5).equals((new Dollar(5)))));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
