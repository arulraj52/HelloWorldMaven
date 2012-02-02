package org.arul.firstapp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.AssertionFailedError;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    private int n1 = 1;
    private int n2 = 1;
    private String s = "not null!";
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue(true);
    }

    public void testAgain()
    {
        assertEquals(n1, n2);
    }


    public void testYetAgain()
    {
        assertNull(s);
    }
}
