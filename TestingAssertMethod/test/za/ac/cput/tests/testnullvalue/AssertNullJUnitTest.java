/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testnullvalue;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertnullvalue.AssertNull;
import za.ac.cput.testingassertmethods.appassertnullvalue.config.AppConfigNull;


/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertNullJUnitTest {
    public static ApplicationContext ctx;
    public static AssertNull appNull;
    
    public AssertNullJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigNull.class);
        appNull = (AssertNull) ctx.getBean("null");
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
     public void testAssertNull() {
        //String name = "Steff";
        Assert.assertNull(appNull.assertNull(null));
    }
    
    @Test
     public void testAssertNotNull() {
        String name = "Steff";
        Assert.assertNotNull(appNull.assertNull(name));
    }
}
