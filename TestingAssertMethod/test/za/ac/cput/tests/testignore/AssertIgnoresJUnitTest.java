/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testignore;

import javax.swing.JOptionPane;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertignore.AssertIgnores;
import za.ac.cput.testingassertmethods.appassertignore.config.AppConfigIgnores;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertIgnoresJUnitTest {
    public static ApplicationContext ctx;
    public static AssertIgnores appIgnores;
    
    public AssertIgnoresJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigIgnores.class);
        appIgnores = (AssertIgnores) ctx.getBean("ignores");
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
    @Ignore
    @Test
    public void tsetAssertIgnores() {
       
            JOptionPane.showMessageDialog(null,appIgnores.addNumber(5,5));
            Assert.assertEquals(10,appIgnores.addNumber(5,5));
    }
}
