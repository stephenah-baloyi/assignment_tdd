/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testfalse;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertfalse.AssertFalse;
import za.ac.cput.testingassertmethods.appassertfalse.config.AppConfigFalse;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertFalseJUnitTest {
    
    public static ApplicationContext ctx;
    public static AssertFalse appFalse;
    
    public AssertFalseJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigFalse.class);
        appFalse = (AssertFalse) ctx.getBean("falsity");
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
    public void testAssertFalse() {
        
        String name = "Steff";
        boolean choice = false;
        if(name.equalsIgnoreCase("Rhulani"))
            choice = true;
        else
            choice = false;
        
        Assert.assertFalse(appFalse.assertFalse(choice));
         
    }
}
