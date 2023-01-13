/**************************************************************
	Purpose/Description: This program is intended to find the number of instances of value k in a given sorted array
	 						with possible duplicate elements using an efficient algorithm.
	Author’s Panther ID: 6241999
	Certification: I hereby certify that this work is my own and none of it is the work of any other person.

	**************************************************************/
public class problem1 
	{
		public static void main(String [] args) {
			int A[] = {-1, 2, 3, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 9, 10};
			int k = 6;
			System.out.print("Elements in array: ");
			for(int i: A) {
				System.out.print(i + ", ");
			}
			System.out.println("");
			System.out.println("The number of instances of k = 6 in Array: " +binarySearch(A, k));
		}
		public static int binarySearch(int A[], int k) {
			int low = 0, high = A.length - 1;
			int first = -1;
			int last = -1;
			int instances;
			// finds the first instance of k
			while(low <= high) {
				int mid = (low + high)/2;
				if(k == A[mid]) {
					first = mid;
					high = mid - 1;
				}else if(k < A[mid]) {
					high = mid - 1;
				}else{
					low = mid + 1;
				}
			}
			low = 0;
			high = A.length - 1;
			// finds the last instance of k
			while(high >= low) {
				int mid = (low + high)/2;
				if(k == A[mid]) {
					last = mid + 1;
					low = mid + 1;
				}else if(k > A[mid]) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}	
			}
			//Return index of last minus index of first
			return instances = last - first;
		}
}
