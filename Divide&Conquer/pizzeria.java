class Solution {
    static void remainingMoney(int[] amount, int[] pocketMoney) {
        for (int i = 0; i < pocketMoney.length; i++) {
            int money = pocketMoney[i];
            for (int j = 0; j < amount.length; j++) {
                if ((money - amount[j]) < 0) {
                    System.out.println(money);
                    break;
                } else if (money == 0) {
                    System.out.println(money);
                }
                money = money - amount[j];
            }
        }
    }
    public static void main(String[] args) {
        int[] amount = {
            12,
            5,
            10,
            8
        };
        int[] pocketMoney = {
            15,
            25,
            5
        };
        remainingMoney(amount, pocketMoney);
    }
}

// Optimal
import java.util.Arrays;
class Codechef
{
    public static void main(String[] args) {
        int[] amount = {
           10, 2, 6, 4, 1
        };
        int[] pocketMoney = {
           19, 5
        };

        int sum = 0;
        for (int i = 0; i < amount.length; i++) {
            sum = amount[i] + sum;
            amount[i] = sum;
        }

        for (int j = 0; j < pocketMoney.length; j++) {
            amountRem(amount, pocketMoney[j]);
        }
    }


    static void amountRem(int[] amount, int pocketMoney) {
        int low = 0;
        int high = amount.length - 1;
        int mid = 0;
        int remAmount = pocketMoney;
        while (low <= high) {
            mid = (low + high) / 2;

            if ((pocketMoney - amount[mid]) >= 0) {
                remAmount = pocketMoney - amount[mid];
                low = mid + 1;
            }
            
            if((pocketMoney - amount[mid]) < 0){
                high=mid-1;
            }
            
            
        }


        System.out.println(remAmount);
    }


}