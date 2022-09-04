package Array;

public class Mountains {
	
	public static void run() {
		
		int[] arr = {5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
		
		int val = mountains(arr);
		
		System.out.println(val);
		
	}
	
	
	
	
	private static int mountains(int[] arr) {
		
		int currCount = 0;
		for(int i=1; i< arr.length-1; i++) {
			
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				
				int cnt = 1;
				int j = i;
				
				
				while(j>=1 && arr[j] > arr[j-1]) {	
						cnt++;
						j--;
				}

					
				while(i <= arr.length -1 && arr[i] > arr[i+1]) {
						cnt ++;
						i++;
					}
				
				if(cnt > currCount) {
					currCount = cnt;
				}
							
			}
				
		}
		
		
		
		return currCount;
	}

}
