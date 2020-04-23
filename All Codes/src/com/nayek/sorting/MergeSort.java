package com.nayek.sorting;

/*Algorithm
MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
*/
public class MergeSort {

	public void merge(int[] arr, int l, int mid, int r) {

		
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] temp1 = new int[n1];
		int[] temp2 = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			temp1[i] = arr[l+i];
		}

		
		for (int j =0; j < n2; j++) {

			temp2[j] = arr[mid+1+j];
		}

		int indexi = 0;
		int indexj = 0;
		int k=l;
		while (indexi < n1 && indexj < n2) {

			if (temp1[indexi] <= temp2[indexj]) {
				arr[k] = temp1[indexi];
				k++;
				indexi++;
			} else {
				arr[k] = temp2[indexj];
				k++;
				indexj++;
			}
		}

		while (indexi < n1) {
			arr[k] = temp1[indexi];
			k++;
			indexi++;
		}
		while (indexj < n2) {
			arr[k] = temp2[indexj];
			k++;
			indexj++;
		}
		
		
	}

	private void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public void sort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(arr, l, mid);
			sort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}

	public static void main(String[] args) {

		MergeSort ob = new MergeSort();
		int[] arr = { 5, 7, 8, 9, 1, 2, 3, 6 };
		ob.printArray(arr);
		ob.sort(arr, 0, arr.length - 1);
		ob.printArray(arr);
	}

}
