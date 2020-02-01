package org.signtel.com.assignment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.signtel.com.assignment.model.Bird;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	
	private final ByteArrayOutputStream testStream = new ByteArrayOutputStream();
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
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
        question1Test();
        testStream.reset();
    }
    
    public void setUp() {
    	System.setOut(new PrintStream(testStream));
    }
    
	public void question1Test() {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		Assert.assertEquals("Iamwalking\n" + "Iamflying\n" + "IamSinging\n", testStream.toString().trim());
	}
}
