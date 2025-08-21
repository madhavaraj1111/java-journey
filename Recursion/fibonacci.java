import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(fib(9));

	}
	
	static int fib(int n){
	    if(n<=1){
	        return n;
	    }
	    else{
	        return fib(n-1)+fib(n-2);
	    }
	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.println(fib(7));

    }

    static int fib(int n) {

        if (n <= 2) {

            if (n == 2) {
                return 1;
            }
            else {
                return 0;
            }

        }

        else {

            return fib(n - 1) + fib(n - 2) + fib(n - 3);
        }
    }
}