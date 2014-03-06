/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appasserttimeout.Impl;

import za.ac.cput.testingassertmethods.appasserttimeout.AssertTimeOut;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertTimeOutImpl implements AssertTimeOut{

    @Override
    public int appTimeout() {
        
        int count = 0;
        
        do{
            count++;
        
        }while(count == 3);
        
        return count;
    }
    
}
