/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testidentity;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertidentity.AssertIdentity;
import za.ac.cput.testingassertmethods.appassertidentity.config.AppConfigIdentity;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertIdentityJUnitTest {
    public static ApplicationContext ctx;
    public static AssertIdentity identity;
    
    public AssertIdentityJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfigIdentity.class);
        identity = (AssertIdentity) ctx.getBean("identity");
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
     public void testIdentity() {
            Assert.assertSame("RhulaniSteff", identity.appAssertIdentity("RhulaniSteff"));
    }
    @Test
     public void testIdentity2() {
            Assert.assertNotSame("RhulaniStef", identity.appAssertIdentity("RhulaniSteff"));
    }
}
