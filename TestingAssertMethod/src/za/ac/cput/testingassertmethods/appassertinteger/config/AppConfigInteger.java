/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertinteger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appassertinteger.AssertCalcInteger;
import za.ac.cput.testingassertmethods.appassertinteger.Impl.AssertCalcIntegerImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigInteger {
    @Bean(name ="calc")
    public AssertCalcInteger calcInteger()
    {
        return new AssertCalcIntegerImpl();
    }
    
}
