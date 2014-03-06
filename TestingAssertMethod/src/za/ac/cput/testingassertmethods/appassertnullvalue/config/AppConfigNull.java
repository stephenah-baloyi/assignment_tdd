/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertnullvalue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertnullvalue.AssertNull;
import za.ac.cput.testingassertmethods.appassertnullvalue.Impl.AssertNullImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigNull {
    @Bean(name = "null")
    public AssertNull appAssertNull()
    {
        return new AssertNullImpl();
    }
}
