/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertignore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertignore.AssertIgnores;
import za.ac.cput.testingassertmethods.appassertignore.Impl.AssertIgnoresImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigIgnores {
    @Bean(name = "ignores")
    
    public AssertIgnores appIgnores()
    {
        return new AssertIgnoresImpl();
    }
}
