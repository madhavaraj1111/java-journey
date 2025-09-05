class Solution {
    static int maxSubArray(int[] nums) {
        int size = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int a = 1; a <= size; a++) {
            int subArraySize = a;
            for (int i = 0;
                (i < size) && (subArraySize <= size); i++) {
                int sum = 0;
                for (int j = i; j < subArraySize; j++) {
                    sum = sum + nums[j];

                }

                if (sum > maxSum) {
                    maxSum = sum;
                }

                subArraySize++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {
            
            -8,-7
        };
        System.out.println(maxSubArray(arr));
    }
}

// Kadanes optimal

class Solution {
    static int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
             int sum=nums[i]+currentSum;
             if(sum>=nums[i]){
                 currentSum=sum;
             }
             else if(sum < nums[i]){
                 currentSum=nums[i];
             }
             
             if(currentSum>maxSum){
                 maxSum=currentSum;
             }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}