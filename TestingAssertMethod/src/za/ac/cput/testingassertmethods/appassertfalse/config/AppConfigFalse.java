/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertfalse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertfalse.AssertFalse;
import za.ac.cput.testingassertmethods.appassertfalse.Impl.AssertFalseImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigFalse {
    @Bean(name="falsity")
    
    public AssertFalse appAssertFalse()
    {
        return new AssertFalseImpl();
    }
    
}
