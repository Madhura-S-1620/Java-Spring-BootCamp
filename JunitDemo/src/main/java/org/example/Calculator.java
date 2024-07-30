package org.example;

public class Calculator {



    public  int AddMethod(int x, int y)
    {
        return x+y;
    }


    public int divisionMethod(int c,int d)
    {
        if(d == 0)
        {
            throw new ArithmeticException("/ by zero..");
        }
        return c/d;

    }

}
