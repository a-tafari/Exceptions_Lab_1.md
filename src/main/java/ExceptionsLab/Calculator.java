package ExceptionsLab;

/**
 * Created by abijah on 9/30/16.
 */
public class Calculator {


    static  double add(double a, double b){

        return a + b;
    }

    static   double subtract(double a, double b){

        return a - b;
    }

    static   double multiply(double a, double b){

        return a * b;
    }

    static   double divide(double a, double b) throws ArithmeticException{

        if(b == 0) throw new ArithmeticException("You can't divide by zero boo,boo!");

        return a/ b;
    }
    static double divide2(double a, double b) throws DivisionByZeroException{
        if(b == 0) throw new DivisionByZeroException();
        return a/b;
    }

    static int sqrt(int a) throws madeUpException{
        if(a < 0) throw new madeUpException();
        return (int)Math.sqrt(a);
    }

}
