/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testtrue;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appasserttrue.AssertTrue;
import za.ac.cput.testingassertmethods.appasserttrue.config.AppConfigTrue;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertTrueJUnitTest {
    public static ApplicationContext ctx;
    public static AssertTrue appTrue;
    
    public AssertTrueJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigTrue.class);
        appTrue = (AssertTrue) ctx.getBean("truth");
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
    public void testAssertTrue() {
     
         Assert.assertTrue(appTrue.assertTrue());
     }
}
