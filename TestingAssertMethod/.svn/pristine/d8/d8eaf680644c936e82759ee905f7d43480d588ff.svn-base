/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertidentity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertidentity.AssertIdentity;
import za.ac.cput.testingassertmethods.appassertidentity.Impl.AssertIdentityImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigIdentity {
    @Bean(name="identity")
    
    public AssertIdentity appIdentity()
    {
        return new AssertIdentityImpl();
    }
    
}
