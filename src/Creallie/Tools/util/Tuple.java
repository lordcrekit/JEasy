/*
 * The MIT License
 *
 * Copyright 2015 William A. Norman (LordCrekit@gmail.com, normanwi@msu.edu).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Creallie.Tools.util;

/**
 *
 * @author William A. Norman (LordCrekit@gmail.com, normanwi@msu.edu)
 * @param <T>
 * @param <G>
 */
public final class Tuple<T, G> {

    /*
     * ================================================ MEMBER VARIABLES ================================================
     */
    private T mFirst;
    private G mSecond;

    /*
     * ================================================== CONSTRUCTORS ==================================================
     */
    /**
     * Default constructor for Tuple.
     */
    public Tuple() {
    }

    /**
     *
     * @param first
     * @param second
     */
    public Tuple( T first, G second ) {
        mFirst = first;
        mSecond = second;
    }

    /*
     * ================================================ PRIMARY FUNCTIONS ===============================================
     */
    /*
     * =============================================== GETTERS AND SETTERS ==============================================
     */
    /**
     * 
     * @return 
     */
    public T getFirst() {
        return mFirst;
    }
    
    /**
     * 
     * @param val
     * @return 
     */
    public Tuple<T,G> setFirst(T val) {
        mFirst = val;
        return this;
    }
    
    /**
     * 
     * @return 
     */
    public G getSecond() {
        return mSecond;
    }
    
    /**
     * 
     * @param val
     * @return 
     */
    public Tuple<T,G> setSecond(G val) {
        mSecond = val;
        return this;
    }
    
    /*
     * ================================================ VISUAL FUNCTIONS ================================================
     */
    /*
     * ================================================ PRIVATE FUNCTIONS ===============================================
     */
}
