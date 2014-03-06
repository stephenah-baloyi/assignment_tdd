

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testexception;

import javax.swing.JOptionPane;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertexception.AssertException;
import za.ac.cput.testingassertmethods.appassertexception.config.AppConfigException;



/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertExceptionJUnitTest {
    
    public static ApplicationContext ctx;
    public static AssertException exc;
    
    public AssertExceptionJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigException.class);
        exc = (AssertException)ctx.getBean("excpt");
        
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
     @Test(expected = NumberFormatException.class)
      public void testnumberformatException() {
     
       int num = Integer.parseInt(JOptionPane.showInputDialog("please enter an number"));
       
         exc.assertException(num);
         
     }
   /* @Test(expected = IndexOutOfBoundsException.class)
      public void testIndexOutOfBoundsException() {
     
        int[] array = new int[1];
         
         exc.appException(array);
         
     }*/
}
