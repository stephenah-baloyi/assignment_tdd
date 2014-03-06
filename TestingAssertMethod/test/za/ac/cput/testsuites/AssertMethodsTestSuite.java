/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import za.ac.cput.tests.testarrays.AssertArrayJUnitTest;
import za.ac.cput.tests.testequals.AssertEqualsJUnitTest;
import za.ac.cput.tests.testexception.AssertExceptionJUnitTest;
import za.ac.cput.tests.testfalse.AssertFalseJUnitTest;
import za.ac.cput.tests.testfloat.AssertFloatJUnitTest;
import za.ac.cput.tests.testidentity.AssertIdentityJUnitTest;
import za.ac.cput.tests.testignore.AssertIgnoresJUnitTest;
import za.ac.cput.tests.testinteger.AssertCalcIntegerJUnitTest;
import za.ac.cput.tests.testnullvalue.AssertNullJUnitTest;
import za.ac.cput.tests.testtimeout.AssertTimeoutJUnitTest;
import za.ac.cput.tests.testtrue.AssertTrueJUnitTest;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value={AssertArrayJUnitTest.class,AssertEqualsJUnitTest.class,AssertExceptionJUnitTest.class,
AssertFalseJUnitTest.class,AssertFloatJUnitTest.class,AssertIgnoresJUnitTest.class,AssertCalcIntegerJUnitTest.class,
AssertNullJUnitTest.class,AssertTimeoutJUnitTest.class,AssertTrueJUnitTest.class,AssertIdentityJUnitTest.class})
public class AssertMethodsTestSuite {

}
