package Misc;

public class MinMax_Array {
	
	public void check() {
		
		int[] arr = {5, 99, 56, 72, 36, 2, 66};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i< arr.length; i++) {
			
			if(arr[i] < min) 
			{
				min = arr[i];
			}
			
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("MIN - " + min + "       MAX - " + max);
		
	}

}
