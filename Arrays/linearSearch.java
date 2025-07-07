import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] array= {10,25,32,12,39};
		int target = 12;
        linearSearch(array,target);
	}
	static void linearSearch(int[]arr,int target){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            System.out.println(target+" "+"is found in the index place "+i);
	            return;
	        }
	        
	    }
	    System.out.println("Not found");
	}
}
