/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testarrays;


import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertarrays.AssertArray;
import za.ac.cput.testingassertmethods.appassertarrays.config.AppConfigArray;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertArrayJUnitTest {
    public static ApplicationContext ctx;
    public static AssertArray appArray;
    
    public AssertArrayJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigArray.class);
        appArray = (AssertArray) ctx.getBean("array");
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
     public void testAssertArray() {
       
         int[] array = new int[]{1,2,3};
         
         Assert.assertArrayEquals(array, appArray.assertArray(array));
    }
}
