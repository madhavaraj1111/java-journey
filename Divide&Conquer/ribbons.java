// Brutte force 

class Codechef
{
    public static void main(String[] args)
    {
        int[] arr = {
            9,
            7,
            5
        };
        int k = 22;

        System.out.println(MaxHeight(arr, k));
    }

    static int MaxHeight(int[] arr, int k) {


        int stickCount = 0;
        int maxHeight = checkMax(arr);
        for (int i = 1; i <= maxHeight; i++) {
            int j = 0;
            int totalSticksMade = 0;
            while (j < arr.length) {
                totalSticksMade += arr[j] / i;
                j++;
            }
            if (totalSticksMade >= k) {
                stickCount = i;
            }



        }

        return stickCount;
    }

    static int checkMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }


        return max;
    }

}

// optimal
class Codechef
{
    public static void main(String[] args)
    {
        int[] arr = {
           5 ,5 ,5 ,5
        };
        int n = 4;
        int k =6;

        System.out.println(MaxHeight(arr, k,n));
    }

    static int MaxHeight(int[] arr, int k,int n) {
        
        int max=checkMax(arr);
        int low=1;
        int high=max;
        
        int ans=0;
    while(low<=high){
       int mid=(low+high)/2;
        int totalCountStick=0;
        
        for(int i=0;i<n;i++){
            
            totalCountStick+=arr[i]/mid;
        
        }
        
        if(totalCountStick>=k){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    
    
    
    return ans;


    }

    static int checkMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }


        return max;
    }

}