/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appasserttrue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appasserttrue.AssertTrue;
import za.ac.cput.testingassertmethods.appasserttrue.Impl.AssertTrueImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigTrue {
    @Bean(name = "truth")
    public AssertTrue assertTruth()
    {
        return new AssertTrueImpl();
    }
}
