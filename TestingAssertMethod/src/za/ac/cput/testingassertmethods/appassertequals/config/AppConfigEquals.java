/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertequals.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertequals.AssertEquals;
import za.ac.cput.testingassertmethods.appassertequals.Impl.AssertEqualsImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigEquals {
    @Bean(name ="equals")
    
    public AssertEquals assertEqual()
    {
        return new AssertEqualsImpl();
    }
    
}
