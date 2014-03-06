/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testingassertmethods.appassertexception.Impl;

import za.ac.cput.testingassertmethods.appassertexception.AssertException;



/**
 *
 * @author  Rhulani Steff Baloyi
 */
public class AssertExceptionImpl implements AssertException {

    @Override
    public int assertException(int number) throws NumberFormatException {
        //throw new UnsupportedOperationException("Not supported yet.");
         return number;
    }

    @Override
    public int[] appException(int[] array) throws IndexOutOfBoundsException{
        //throw new UnsupportedOperationException("Not supported yet.");
        array = new int[10];
        int ar = 0;
         ar = array[0];
         return array;
    }
    
}
