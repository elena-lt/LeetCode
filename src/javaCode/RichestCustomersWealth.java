package javaCode;

public class RichestCustomersWealth {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
     * Memory Usage: 38.3 MB, less than 90.64% of Java online submissions for Richest Customer Wealth.
     * @param accounts
     * @return
     */
    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tempRes = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tempRes += accounts[i][j];
            }
            if (tempRes > result) result = tempRes;
        }
        return result;
    }
}
