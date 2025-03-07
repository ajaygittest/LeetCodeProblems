package Sample;

public class MaxProfiit {
	
	 public int maxProfit(int[] prices) {

		  if (prices == null || prices.length < 2) {
		            return 0;
		        }
		         int minPrice = Integer.MAX_VALUE;
		        int maxProfit = 0;

		        for(int price:prices){

		            if(price<minPrice){
		                minPrice=price;
		            }else{
		                int profit=price-minPrice;
		                maxProfit=Math.max(maxProfit,profit);
		            }
		        }

		        return maxProfit;

		        
		    }

}
