package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyOneBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    pub


}
