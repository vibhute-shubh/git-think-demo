package com.app.tester;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.app.utilities.DataSearching;
import com.app.utilities.DataSorting;

public class DataSearchingSortingTester {

	//Menu-list : modifiable
	public static void menuList() {
		System.out.println("\n===============================================================================");
		System.out.println("0.Exit the application");
		System.out.println("1.Input your data into an Array");
		System.out.println("2.Print the data");
		System.out.println("3.Find element: Linear search technique");
		System.out.println("4.Find element: Binary search technique");
		System.out.println("5.Sort an array: Selection sort");
		System.out.println("6.Sort an array: Bubble sort");
		System.out.println("7.Sort an array: Optimized Bubble sort");
		System.out.println("8.Sort an array: Insertion sort");
		System.out.println("===============================================================================\n");

	}

	//Console-based testing of methods
	public static void main(String[] args) {

		DataSearching data_search = new DataSearching();
		DataSorting data_sort = new DataSorting();

		try (Scanner sc = new Scanner(System.in)){
			System.out.println("****************Welcome to Data Searching and Sorting App****************");

			System.out.println("Enter the size of an Array you want to work upon: ");
			int size = sc.nextInt();
			int[] arr = new int[size];
			int choice;
			do {
				//Calling menu list
				DataSearchingSortingTester.menuList();
				System.out.print("Please enter your choice: ");
				choice = sc.nextInt();

				switch (choice) {
				case 0: {
					System.out.println("Thank you for using our application..!");
					System.exit(0);
				}

				case 1:{
					for(int i = 0; i < size; i++) {
						System.out.println("Enter the data in the array : ");
						int data = sc.nextInt();
						arr[i] = data;
					}
					break;
				}

				case 2:{
					System.out.print("Array is : [");
					for(int i = 0; i < size; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.print("]");

					break;
				}

				case 3:{
					System.out.println("\nEnter the element to be searched : ");
					int element = sc.nextInt();

					if(data_search.linearSearch(arr, element)) {
						System.out.println("Element found in the array..!");
					}else {
						System.out.println("Element not found..!");
					}

					break;
				}

				case 4:{
					System.out.println("\nEnter the element to be searched : ");
					int element = sc.nextInt();

					int res = data_search.binarySearch(arr, 0, size-1, element); 

					if(res == -1) {
						System.out.println("Element not found in the array..");
					} else{
						System.out.println("Element found in the array..");
						System.out.println("Position of element in the array : "+res);
					}

					break;
				}


				case 5:{
					data_sort.selectionSort(arr);
					break;
				}


				case 6:{
					data_sort.bubbleSort(arr);
					break;
				}

				case 7:{
					if(data_sort.isArraySorted(arr)) {
						System.out.println("Array is already sorted...!");
						return;
					} else {
						data_sort.bubbleSort(arr);
					}

					break;
				}

				case 8:{
					data_sort.insertionSort(arr);
					break;
				}

				default:
					System.out.println("Invalid input. Please try again :(");
					break;
				}
			}while(choice!=0);
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}
}
