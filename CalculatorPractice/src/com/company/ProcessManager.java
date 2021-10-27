package com.company;

public class ProcessManager implements Process{

    @Override
    public double sum(double x , double y) {
       double result ;
              result = x+ y;
              return result ;

    }

    @Override
    public double sub(double x, double y) {
        double result ;
        result = x - y;
        return result ;

    }

    @Override
    public double mul(double x,double y) {
        double result ;
        result = x* y;
        return result ;

    }

    @Override
    public double div(double x,double y) {
        double result ;
        result = x/y;
        return result ;

    }
}
