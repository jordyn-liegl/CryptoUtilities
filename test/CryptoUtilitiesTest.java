import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * @author Jordyn Liegl
 *
 */
public class CryptoUtilitiesTest {

    /**
     * Tests of reduceToGCD.
     */

    /**
     * boundary.
     */
    @Test
    public void testReduceToGCD_0_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(0);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /**
     * routine.
     */
    @Test
    public void testReduceToGCD_30_21() {
        NaturalNumber n = new NaturalNumber2(30);
        NaturalNumber nExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(21);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /**
     * challenging.
     */
    @Test
    public void testReduceToGCD_31_21() {
        NaturalNumber n = new NaturalNumber2(31);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber m = new NaturalNumber2(21);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /**
     * challenging.
     */
    @Test
    public void testReduceToGCD_10_10() {
        NaturalNumber n = new NaturalNumber2(10);
        NaturalNumber nExpected = new NaturalNumber2(10);
        NaturalNumber m = new NaturalNumber2(10);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /**
     * Tests of isEven.
     */

    /**
     * boundary
     */
    @Test
    public void testIsEven_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * boundary
     */
    @Test
    public void testIsEven_1() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /**
     * challenging.
     */
    @Test
    public void testIsEven_2465() {
        NaturalNumber n = new NaturalNumber2(2465);
        NaturalNumber nExpected = new NaturalNumber2(2465);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /**
     * challenging.
     */
    @Test
    public void testIsEven_1356() {
        NaturalNumber n = new NaturalNumber2(1356);
        NaturalNumber nExpected = new NaturalNumber2(1356);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * Tests of powerMod.
     */

    /**
     * boundary.
     */
    @Test
    public void testPowerMod_0_0_2() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(0);
        NaturalNumber pExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    /**
     * routine.
     */
    @Test
    public void testPowerMod_17_18_19() {
        NaturalNumber n = new NaturalNumber2(17);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(18);
        NaturalNumber pExpected = new NaturalNumber2(18);
        NaturalNumber m = new NaturalNumber2(19);
        NaturalNumber mExpected = new NaturalNumber2(19);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    /**
     * challenging.
     */
    @Test
    public void testPowerMod_101_2_3() {
        NaturalNumber n = new NaturalNumber2(101);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(2);
        NaturalNumber pExpected = new NaturalNumber2(2);
        NaturalNumber m = new NaturalNumber2(3);
        NaturalNumber mExpected = new NaturalNumber2(3);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    /**
     * boundary.
     */
    @Test
    public void testPowerMod_1_2_2() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(2);
        NaturalNumber pExpected = new NaturalNumber2(2);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    /**
     * Tests of isWitnessToCompositeness.
     */

    /**
     * boundary.
     */
    @Test
    public void testIsWitnessToCompositeness_2_4() {
        NaturalNumber w = new NaturalNumber2(2);
        NaturalNumber wExpected = new NaturalNumber2(2);
        NaturalNumber n = new NaturalNumber2(4);
        NaturalNumber nExpected = new NaturalNumber2(4);
        boolean result = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * routine.
     */
    @Test
    public void testIsWitnessToCompositeness_53_55() {
        NaturalNumber w = new NaturalNumber2(53);
        NaturalNumber wExpected = new NaturalNumber2(53);
        NaturalNumber n = new NaturalNumber2(55);
        NaturalNumber nExpected = new NaturalNumber2(55);
        boolean result = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * boundary.
     */
    @Test
    public void testIsWitnessToCompositeness_3_5() {
        NaturalNumber w = new NaturalNumber2(3);
        NaturalNumber wExpected = new NaturalNumber2(3);
        NaturalNumber n = new NaturalNumber2(5);
        NaturalNumber nExpected = new NaturalNumber2(5);
        boolean result = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /**
     * routine.
     */
    @Test
    public void testIsWitnessToCompositeness_50_500() {
        NaturalNumber w = new NaturalNumber2(50);
        NaturalNumber wExpected = new NaturalNumber2(50);
        NaturalNumber n = new NaturalNumber2(500);
        NaturalNumber nExpected = new NaturalNumber2(500);
        boolean result = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * Tests of isPrime1.
     */

    /**
     * routine.
     */
    @Test
    public void testIsPrime1_5() {
        NaturalNumber n = new NaturalNumber2(5);
        NaturalNumber nExpected = new NaturalNumber2(5);
        boolean result = CryptoUtilities.isPrime1(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * boundary.
     */
    @Test
    public void testIsPrime1_100000000() {
        NaturalNumber n = new NaturalNumber2(100000000);
        NaturalNumber nExpected = new NaturalNumber2(100000000);
        boolean result = CryptoUtilities.isPrime1(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /**
     * challenging.
     */
    @Test
    public void testIsPrime1_81() {
        NaturalNumber n = new NaturalNumber2(81);
        NaturalNumber nExpected = new NaturalNumber2(81);
        boolean result = CryptoUtilities.isPrime1(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /**
     * routine.
     */
    @Test
    public void testIsPrime1_31() {
        NaturalNumber n = new NaturalNumber2(31);
        NaturalNumber nExpected = new NaturalNumber2(31);
        boolean result = CryptoUtilities.isPrime1(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * Tests of isPrime2.
     */

    /**
     * boundary.
     */
    @Test
    public void testIsPrime2_3() {
        NaturalNumber n = new NaturalNumber2(3);
        NaturalNumber nExpected = new NaturalNumber2(3);
        boolean result = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * routine.
     */
    @Test
    public void testIsPrime2_101() {
        NaturalNumber n = new NaturalNumber2(101);
        NaturalNumber nExpected = new NaturalNumber2(101);
        boolean result = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /**
     * challenging.
     */
    @Test
    public void testIsPrime2_27() {
        NaturalNumber n = new NaturalNumber2(27);
        NaturalNumber nExpected = new NaturalNumber2(27);
        boolean result = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /**
     * boundary.
     */
    @Test
    public void testIsPrime2_10000000() {
        NaturalNumber n = new NaturalNumber2(10000000);
        NaturalNumber nExpected = new NaturalNumber2(10000000);
        boolean result = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /**
     * Tests of generateNextLikelyPrime.
     */

    /**
     * routine.
     */
    @Test
    public void testGenerateNextLikelyPrime_4() {
        NaturalNumber n = new NaturalNumber2(4);
        NaturalNumber nExpected = new NaturalNumber2(5);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    /**
     * challenging.
     */
    @Test
    public void testGenerateNextLikelyPrime_1000() {
        NaturalNumber n = new NaturalNumber2(1000);
        NaturalNumber nExpected = new NaturalNumber2(1009);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    /**
     * challenging.
     */
    @Test
    public void testGenerateNextLikelyPrime_5() {
        NaturalNumber n = new NaturalNumber2(5);
        NaturalNumber nExpected = new NaturalNumber2(5);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    /**
     * routine.
     */
    @Test
    public void testGenerateNextLikelyPrime_38() {
        NaturalNumber n = new NaturalNumber2(38);
        NaturalNumber nExpected = new NaturalNumber2(41);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }
}