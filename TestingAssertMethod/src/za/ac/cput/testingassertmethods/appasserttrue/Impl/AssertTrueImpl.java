/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appasserttrue.Impl;

import za.ac.cput.testingassertmethods.appasserttrue.AssertTrue;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class AssertTrueImpl implements AssertTrue{

    @Override
    public boolean assertTrue() {
        String name = "Rhulani";
        boolean choice;
        
        if(name.equalsIgnoreCase("rhulani"))
            choice = true;
        else
            choice = false;
        return choice;
    }
    
}
