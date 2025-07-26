public class binarySearchinTwoDim {
    public static void main (String[] args)
	{
		int[][]arr=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		System.out.println(search(arr,18));
	}
	
	static boolean search(int[][]arr,int target){
	    int m=arr.length;
	    int n=arr[0].length;
	    
	    int low=0;
	    int high=m*n-1;
	    
	    while(low<=high){
	        int mid=(low+high)/2;
	        int row=mid/n;
	        int col=mid%n;
	        
	        if(arr[row][col]==target){
	            return true;
	        }
	        if(target>arr[row][col]){
	            low=mid+1;
	        }
	        if(target<arr[row][col]){
	            high=mid-1;
	        }
	        
	    }
	    
	    return false;
	}
}
