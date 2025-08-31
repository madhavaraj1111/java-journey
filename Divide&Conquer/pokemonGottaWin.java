import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	   int pokemon = 100;
	   int money = 100;
	   int evolve = 20;
	   int sell = 10;
	  
	  System.out.println(countPokemons(pokemon,money,evolve,sell));

	}
	
	static int countPokemons(int n,int m,int x,int y){
	    
	    int low=0;
	    int high=n;
	    int mid =0;
	    while(high>=low){
	        mid = (low+high)/2;
	        if(check(n,m,x,y,mid)>0){
	           
	           low=mid+1;
	            
	           
	        }
	        else{
	            
	            high=mid-1;
	        }
	        
	        
	        
	       
	    }
	    return mid;
	}
	
	static int check(int n,int m,int x,int y,int mid){
	    return (m+(y*(n-mid))-(x*mid));
	}
}
