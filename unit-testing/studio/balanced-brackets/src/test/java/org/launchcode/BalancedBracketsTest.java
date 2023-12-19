package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void balancedBracketsContainsNumbersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[012]"));
    }
    @Test
    public void unbalancedBracketsContainsNumbersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("0]12["));
    }
    @Test
    public void containsNonAlphanumericCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{]"));
    }
    @Test
    public void wrongBracketOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void bracketsEverywhereReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }
    @Test
    public void stringContainsNonBracketCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void closingBracketsFirstReturnsFalse() {
        String testData = "][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}