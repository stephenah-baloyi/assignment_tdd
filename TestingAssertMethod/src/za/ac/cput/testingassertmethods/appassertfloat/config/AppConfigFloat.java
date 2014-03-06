/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertfloat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertfloat.AssertFloat;
import za.ac.cput.testingassertmethods.appassertfloat.Impl.AssertFloatImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigFloat {
    @Bean(name="floats")
    
    public AssertFloat appAssertFloats()
    {
        return new AssertFloatImpl();
    }
    
}
