
package lab.pkg10;

import java.util.*;
import java.math.*;
import java.util.concurrent.TimeUnit;
import javafx.util.converter.BigIntegerStringConverter;
/**
 *
 * @author Muhammmad Akma Adhwa Bin Zamburi
 * If there is some Error please do pull request.
 * Cheers
 */
public class LAB10 {


    public static void main(String[] args) {

    	/**This Method is using Hashmap to calculate the Fibonacci Number
    	 *@param	Start		This is use to store the start time in milis
    	 *@param	End			To store time in milis after some function is run
    	 *
    	 */


        long Start,End;

        HashMap<Integer, BigInteger> memoized = new HashMap<Integer, BigInteger>();

        Start = Running_Time();

        System.out.println("Fibonacci number : "+fibonacciArray(200));

        End = Running_Time();

        Duration(Start, End);


        /**This Method is using Arrays to calculate the Fibonacci Number
	   	 *
	   	 */

        Start = Running_Time();

        BigInteger Array_method_ = fibonacciArray(200);

        System.out.println("Fibonacci number (Arrays) " + Array_method_);

        End = Running_Time();

        Duration(Start, End);

    }

    private static BigInteger fibonacci(int n, HashMap<Integer,BigInteger> memoized)
    {
        if (memoized.containsKey(n))
            return memoized.get(n);

        if(n <= 0){
            return BigInteger.ZERO;

        }

        if(n <= 2){
            return BigInteger.ONE;
        }

        else{
            BigInteger fib = fibonacci(n - 1, memoized).add (fibonacci(n - 2, memoized));

//            System.out.println("fibonacci[" + n + "] = " + fib );

                memoized.put(n, fib);

            return fib;
        }

    }

    private static BigInteger fibonacciArray (int n){

        BigInteger[] Arr  = new BigInteger[n+1];

            Arr[0] =BigInteger.ZERO ;

            Arr[1] =BigInteger.ONE ;

            for(int i = 2; i < n+1 ;i++){

                Arr[i] = (Arr[i-1].add(Arr[i-2]));

            }

            return Arr[n];

    }

    private static long  Running_Time(){

    	return System.currentTimeMillis();

    }

    private static void Duration(long Start, long End){

    	System.out.println("The time duration is "+(End - Start));
    }
}
