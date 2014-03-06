/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testequals;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertequals.AssertEquals;
import za.ac.cput.testingassertmethods.appassertequals.config.AppConfigEquals;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertEqualsJUnitTest {
    
   public static ApplicationContext ctx;
   public static AssertEquals appEqual;
    
    public AssertEqualsJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigEquals.class);
        appEqual = (AssertEquals) ctx.getBean("equals");
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
    @Test
   public void testAssertEquals() {
        
        Assert.assertEquals(25, appEqual.appAssertEquals(10, 5, 10));
    }
}
