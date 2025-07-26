import java.util.Arrays;
class Codechef
{
	public static void main (String[] args)
	{
	     int[][]arr=new int[][]{{4,5,6,7},{7,8,9,10},{10,11,12,13}};
	     transpose(arr);
	}
	
	static void transpose(int[][]arr){
	    int m=arr.length;
	    int n=arr[0].length;
	    int [][]newArr=new int[n][m];
	    for(int i=0;i<newArr.length;i++){
	        for(int j=0;j<newArr[i].length;j++){
	            
	            newArr[i][j]=arr[j][i];
	            
	        }
	    }
	    
	    for(int[] elem:newArr){
	        reverseRow(elem);
	        
	    }
	}
	
	static void reverseRow(int[]newArr){
	    int j=newArr.length-1;
	    for(int i=0;i<newArr.length/2;i++){
	        int temp=newArr[i];
	        newArr[i]=newArr[j];
	        newArr[j]=temp;
	        j--;
	    }
	    System.out.println(Arrays.toString(newArr));
	}
}