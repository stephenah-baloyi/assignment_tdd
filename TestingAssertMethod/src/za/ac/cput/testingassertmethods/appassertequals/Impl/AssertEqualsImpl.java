/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertequals.Impl;

import za.ac.cput.testingassertmethods.appassertequals.AssertEquals;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertEqualsImpl implements AssertEquals{

    @Override
    public int appAssertEquals(int a, int b, int c) {
         int results;
        results = a + b + c;
        
        return results;
    }
    
}
