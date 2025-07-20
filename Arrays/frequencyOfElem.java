// Mine approach to find frequency of elements in an array
// This code sorts the array and counts the frequency of each element

import java.util.Arrays;
public class frequencyOfElem{

	public static void main (String[] args)
	{
		int[]arr={5,8,5,7,8,10};
		frequency(arr);
	}
	static void frequency(int[]arr){
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++){
	        int count=1;
	        while((i<arr.length-1)&&(arr[i]==arr[i+1])){
	            count++;
	            i++;
	        }
	        
	        System.out.println(arr[i]+":"+count);
	        
	    }
	}

}