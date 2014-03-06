/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appasserttimeout.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.testingassertmethods.appasserttimeout.AssertTimeOut;
import za.ac.cput.testingassertmethods.appasserttimeout.Impl.AssertTimeOutImpl;

/**
 *
 * @author Rhulani Steff Baloyi
 */
@Configuration
public class AppConfigTimeout {
    @Bean(name = "timeout")
    public AssertTimeOut appAssertTimeout()
    {
        return new AssertTimeOutImpl();
    }
}
