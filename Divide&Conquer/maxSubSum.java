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

