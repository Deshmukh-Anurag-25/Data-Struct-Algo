package Array;

/**
 * This class provides a method to calculate the maximum profit
 * from buying and selling a stock once, given daily prices.
 */
public class BestTimeBuyAndSell {

    /**
     * Computes the maximum profit from a single buy-sell transaction.
     *
     * @param prices an array where each element represents the stock price on that day
     * @return the maximum profit possible; returns 0 if no profit can be made
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    /**
     * Main method to test the maxProfit functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        BestTimeBuyAndSell solution = new BestTimeBuyAndSell();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Test 1 (profit possible): " + solution.maxProfit(prices1));
        System.out.println("Test 2 (no profit): " + solution.maxProfit(prices2));
    }
}
