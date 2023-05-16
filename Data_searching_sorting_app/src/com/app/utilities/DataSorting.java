package com.app.utilities;

public class DataSorting {

	public void bubbleSort(int[] arr) {
		int pass, i, temp,count=0;
		boolean swapped = false;
		for( pass = arr.length -1; pass >= 0 && !swapped;pass--) {
			count++;
			swapped = true;
			for(i = 0; i <= pass - 1;i++) {
				if(arr[i] > arr[i+1]){
					// swap elements
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]= temp;
					swapped = false;
				}
			}
		}
		if(count==1)
			System.out.println("Array is already sorted..!");
		else
			System.out.println("Array is not sorted");
		System.out.println("Iterations done: "+count);
	}


	public void selectionSort(int[] arr) {
		int i ,j,temp;
		for(i = 0; i<arr.length-1;i++) {
			for(j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					//swap elements
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public void insertionSort(int[] arr) {
		// Used for forward movement
		for(int i = 1; i< arr.length;i++) {
			int key = arr[i];
			// Used for backward movement
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}


	public void print(int arr[],int size) {
		System.out.print("[");
		for(int i = 0; i< size ;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}


	public boolean isArraySorted(int[] arr) {
		int pass, i, temp,count=0;
		boolean swapped = false;
		for( pass = arr.length -1; pass >= 0 && !swapped;pass--) {
			count++;
			swapped = true;
			for(i = 0; i <= pass - 1;i++) {
				if(arr[i] > arr[i+1]){
					// swap elements
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]= temp;
					swapped = false;
				}
			}
		}
		if(count==1)
			return true;
		else
			return false;
	}
}
