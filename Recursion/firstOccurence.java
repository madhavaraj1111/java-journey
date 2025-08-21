import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 
	 int arr[]={10,40,20,20,70};
	 PrintArr(arr,arr.length,0,40);

	}
	
	static void PrintArr(int []arr,int size,int i,int val){
	    if(i==size){
	        return;
	    }
	    if(arr[i]==val){
	    System.out.println(i);
	    i=size-1;
	    }
	    PrintArr(arr,size,++i,val);
	}
}
