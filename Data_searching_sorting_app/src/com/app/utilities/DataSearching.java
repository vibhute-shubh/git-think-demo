package com.app.utilities;

public class DataSearching {
		
	public DataSearching() {
		super();
	}


	//Method for linear searching technique
	public boolean linearSearch(int arr[] ,int element) {

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return true;
			}
		}
		return false;
	}


	//Method for binary searching technique
	public int binarySearch(int arr[],int low,int high, int element) {

		int mid;

		if(high >= low)     
		{  
			mid = (low + high)/2; 

			// if the item to be searched is present at middle  
			if(arr[mid] == element) {   
				return mid + 1;  
			} else if(arr[mid] < element) {    // if the item to be searched is smaller than middle, then it can only be in left subarray
				return binarySearch(arr, mid+1, high, element);    
			} else {
				return binarySearch(arr, low, mid-1, element);    
			}    
		}    
		return -1;    
	}
}
