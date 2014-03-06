/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertfloat.Impl;

import za.ac.cput.testingassertmethods.appassertfloat.AssertFloat;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertFloatImpl implements AssertFloat{

    @Override
    public double assertFloats(double a, double b) {
        
        return(a + b);
    }

    
}
