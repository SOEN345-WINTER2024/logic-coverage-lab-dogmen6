/*
Predicate Coverage: Test cases cover at least one true condition, one false condition, and one mixed condition.
Clause Coverage: There are tests for all true conditions for each individual clause and one test for all false conditions.
CACC (Conditional-Absolute Clause Coverage): All possible combinations of true/false values for the clauses are covered in separate tests, ensuring each combination is tested at least once.
RACC (Restricted-Absolute Clause Coverage): Similar to CACC, all possible combinations of true/false values for the clauses are covered, including those where a clause's value doesn't affect the outcome.
*/

import org.junit.Test;
import static org.junit.Assert.*;


public class CheckItTest {

    // Test cases to achieve Predicate Coverage
    @Test
    public void testPredicateCoverage_TTT() {
        assertTrue("Should return False", CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testPredicateCoverage_TFF() {
        assertTrue("Should return False", CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testPredicateCoverage_FFF() {
        assertFalse("Should return True", CheckIt.checkIt(false, false, false));
    }

    // Test cases to achieve Clause Coverage

    @Test
    public void testClauseCoverage_TTT() {
        assertTrue("Should return False", CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testClauseCoverage_TFT() {
        assertTrue("Should return False", CheckIt.checkIt(true, false, true));
    }

    @Test
    public void testClauseCoverage_FTT() {
        assertTrue("Should return False", CheckIt.checkIt(false, true, true));
    }

    @Test
    public void testClauseCoverage_FFF() {
        assertFalse("Should return True", CheckIt.checkIt(false, false, false));
    }

    // Test cases to achieve CACC (Conditional-Absolute Clause Coverage)
    @Test
    public void testCACC_TTT() {
        assertTrue("Should return False", CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testCACC_TFT() {
        assertTrue("Should return False", CheckIt.checkIt(true, false, true));
    }

    @Test
    public void testCACC_FTT() {
        assertTrue("Should return False", CheckIt.checkIt(false, true, true));
    }

    @Test
    public void testCACC_FFT() {
        assertFalse("Should return True", CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testCACC_TTF() {
        assertTrue("Should return False", CheckIt.checkIt(true, true, false));
    }

    @Test
    public void testCACC_TFF() {
        assertTrue("Should return False", CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testCACC_FTF() {
        assertFalse("Should return True", CheckIt.checkIt(false, true, false));
    }

    @Test
    public void testCACC_FFF() {
        assertFalse("Should return True", CheckIt.checkIt(false, false, false));
    }

    // Test cases to achieve RACC (Restricted-Absolute Clause Coverage)
    @Test
    public void testRACC_TTT() {
        assertTrue("Should return False", CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testRACC_TFT() {
        assertTrue("Should return False", CheckIt.checkIt(true, false, true));
    }

    @Test
    public void testRACC_FTT() {
        assertTrue("Should return False", CheckIt.checkIt(false, true, true));
    }

    @Test
    public void testRACC_FFT() {
        assertFalse("Should return True", CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testRACC_TTF() {
        assertTrue("Should return False", CheckIt.checkIt(true, true, false));
    }

    @Test
    public void testRACC_TFF() {
        assertTrue("Should return False", CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testRACC_FTF() {
        assertFalse("Should return True", CheckIt.checkIt(false, true, false));
    }

    @Test
    public void testRACC_FFF() {
        assertFalse("Should return True", CheckIt.checkIt(false, false, false));
    }

}
