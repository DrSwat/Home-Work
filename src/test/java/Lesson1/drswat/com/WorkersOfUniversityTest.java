package Lesson1.drswat.com;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class WorkersOfUniversityTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WorkersOfUniversityTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( WorkersOfUniversityTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testWorkersOfUniversity()
    {
        assertTrue( true );
    }
}
