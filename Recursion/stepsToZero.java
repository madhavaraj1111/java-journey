class Solution {
    public static void main(String[] args)
    {
        int n = 125;
        
        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int num) {
        return reduceToZero(num, 0);
    }
    static int reduceToZero(int num, int stepCount) {
        if (num == 0) {
            return stepCount;
        }
        stepCount = stepCount + 1;
        if (num % 2 == 0) {
            return reduceToZero(num / 2, stepCount);
        }


        return reduceToZero(num - 1, stepCount);

    }
}