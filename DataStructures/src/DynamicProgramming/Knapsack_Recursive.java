package DynamicProgramming;

public class Knapsack_Recursive {
	
	
	public static void Run() {
		
		int wt[] = {1,3,4,5};
		int val[] = {1,4,5,7};
		int W = 7;
		int n = wt.length;
				
		int ans = knapsack(wt, val, W, n);
		System.out.println(ans);
	}
	
	
	private static int knapsack(int[] wt, int[] val, int W, int n) {
		
		if(n==0 || W == 0) {
			return 0;
		}
		
		if(wt[n-1] <= W) {
			
			return Integer.max(val[n-1] + knapsack(wt, val, W - wt[n-1], n-1), 
					knapsack(wt, val, W, n-1));
		}
		else {
			return knapsack(wt, val, W, n-1);
		}
		
	}
	
	

}
