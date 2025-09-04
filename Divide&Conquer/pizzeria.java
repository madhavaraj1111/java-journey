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