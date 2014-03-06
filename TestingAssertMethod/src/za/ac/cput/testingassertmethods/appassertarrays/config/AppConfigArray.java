/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertarrays.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertarrays.AssertArray;
import za.ac.cput.testingassertmethods.appassertarrays.Impl.AssertArrayImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigArray {
    @Bean(name="array")
    
    public AssertArray assertArrays()
    {
        return new AssertArrayImpl();
    }
    
}
