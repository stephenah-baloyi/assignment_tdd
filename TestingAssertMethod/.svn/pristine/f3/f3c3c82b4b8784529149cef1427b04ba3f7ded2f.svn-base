/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.tests.testinteger;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.testingassertmethods.appassertinteger.AssertCalcInteger;
import za.ac.cput.testingassertmethods.appassertinteger.config.AppConfigInteger;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertCalcIntegerJUnitTest {
    public static ApplicationContext ctx;
    public static AssertCalcInteger appCalc;
    
    public AssertCalcIntegerJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfigInteger.class);
        appCalc = (AssertCalcInteger)  ctx.getBean("calc");
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
    public void testAdd() {
    
        Assert.assertEquals(5,appCalc.addIntegers(3, 2));
    }
    @Test
    public void testSubtract() {
    
        Assert.assertEquals(4,appCalc.subtractIntegers(7,3));
    }
    @Test
    public void testMultiply() {
    
        Assert.assertEquals(20,appCalc.multiplyIntegers(4,5));
    }
    @Test
    public void testDevide() {
    
        Assert.assertEquals(6,appCalc.devideIntegers(30, 5));
    }
}
