import java.util.Arrays;
class Codechef
{
    public static void main(String[] args)
    {
        int[] arr = {
          2, 12, 11, 3, 26, 7
        };
        Arrays.sort(arr);
        int k = 5;
        
        System.out.println(isFeasible(arr, k));
    }


    static int isFeasible(int[] arr, int k) {


        int low = 0;
        int high = arr[arr.length - 1];
        
        int minMax=0;

        for (int d = low; d < high; d++) {
            if (aggressiveCows(arr, k, d)) {

                minMax=d;
            }
        }
        
        return minMax;

    }

    static boolean aggressiveCows(int[] arr, int k, int d) {


        int cow = 1;

        int last = arr[0];

        for (int j = 1; j < arr.length; j++) {
            if ((cow != 0) && (arr[j] - last >= d)) {
                last = arr[j];
                cow++;

            }

            if (cow == k) {
                return true;
            }

        }

        return false;



    }
}


// Optimal approach

import java.util.Arrays;
class Codechef
{
    public static void main(String[] args)
    {
        int[] arr = {
       1, 1000000000
        };
        Arrays.sort(arr);
        int k = 2;
        
        System.out.println(isFeasible(arr, k));
    }


    static int isFeasible(int[] arr, int k) {


        int low = 0;
        int high = arr[arr.length - 1]-arr[0];
        
        int mid = 0;
        int minMax=0;
        while(high>=low){
            mid=(low+high)/2;
            
        
            if (aggressiveCows(arr, k, mid)) {
                minMax=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        
        return minMax;

    }

    static boolean aggressiveCows(int[] arr, int k, int d) {


        int cow = 1;

        int last = arr[0];

        for (int j = 1; j < arr.length; j++) {
            if ((cow != 0) && (arr[j] - last >= d)) {
                last = arr[j];
                cow++;

            }

            if (cow == k) {
                return true;
            }

        }

        return false;



    }
}