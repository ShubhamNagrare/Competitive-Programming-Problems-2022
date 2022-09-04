package DynamicProgramming;

public class Knapsack_Memoization {
	
	private static int[][] t;
	
	public static void run() {
		
		int wt[] = {1,3,4,5};
		int val[] = {1,4,5,7};
		int W = 7;
		int n = wt.length;
		
		t = new int[n+1][W+1];
		
		for(int i=0; i< n+1; i++) {
			for(int j=0; j<W+1; j++) {
			
				t[i][j] = -1;
			}
		}
		
				
		int ans = knapsack(wt, val, W, n);
		System.out.println(ans);
	}
	
	private static int knapsack(int wt[], int val[], int W, int n) {
		
		if(n==0 || W==0) {
			
			return 0;
		}
			
		if(t[n][W] != -1) {
			return t[n][W];			
		}
		
		if(wt[n-1] <= W) {
			
			return t[n][W] = Integer.max(val[n-1] + knapsack(wt, val, W - wt[n-1], n-1),
					knapsack(wt, val, W, n-1));
			
		}	
		else {
			return knapsack(wt, val, W, n-1);
		}
				
	}
	
	
	
	
	
	
	

}
