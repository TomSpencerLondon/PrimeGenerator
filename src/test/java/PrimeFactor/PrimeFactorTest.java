package PrimeFactor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {
    @Test public void
    of_1_is_empty() {
        assertEquals(new ArrayList<Integer>(), PrimeFactor.of(1));
    }
    @Test public void
    of_2_is_2() {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors.add(2);
        assertEquals(factors, PrimeFactor.of(2));
    }
    @Test public void
    of_3_is_3() {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors.add(3);
        assertEquals(factors, PrimeFactor.of(3));
    }
    @Test public void
    of_4_is_2_2() {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors.add(2);
        factors.add(2);
        assertEquals(factors, PrimeFactor.of(4));
    }
}