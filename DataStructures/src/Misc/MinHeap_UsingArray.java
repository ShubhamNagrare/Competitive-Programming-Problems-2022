package Misc;

public class MinHeap_UsingArray {
	
	int theHeap[];
	int capacity;
	int pos;
	
	public MinHeap_UsingArray() {
		
		capacity = 10;
		pos = 1;
		theHeap = new int[capacity];
	}
	
	
	public void print() {
		for(int i=1; i<pos; i++) {
			System.out.println("--> " + theHeap[i]);
		}
	}
	
	public void insert(int value) {
		
		if(pos == capacity) {
			
			
		}
		else {
			
			theHeap[pos++] = value;
			
			int child = pos - 1;
			int parent = child/2;
			
			while(theHeap[parent] > theHeap[child] && parent > 0) {
				
				int tmp = theHeap[parent];
				theHeap[parent] = theHeap[child];
				theHeap[child] = tmp;
				
				child = parent;
				parent = child/2;
			}
			
			
		}
	}

}
