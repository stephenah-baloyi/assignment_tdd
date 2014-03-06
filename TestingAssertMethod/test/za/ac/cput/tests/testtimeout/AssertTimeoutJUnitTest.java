/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testtimeout;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appasserttimeout.AssertTimeOut;
import za.ac.cput.testingassertmethods.appasserttimeout.config.AppConfigTimeout;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertTimeoutJUnitTest {
    public static ApplicationContext ctx;
    public static AssertTimeOut appTimeout;
    
    public AssertTimeoutJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigTimeout.class);
        appTimeout = (AssertTimeOut) ctx.getBean("timeout");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(timeout = 3)
    public void testTimeout() {
        Assert.assertEquals(1,appTimeout.appTimeout());
            
    }
}
