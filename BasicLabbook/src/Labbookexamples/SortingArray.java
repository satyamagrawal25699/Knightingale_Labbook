package Labbookexamples;
import java.util.Scanner;



public class SortingArray {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please Enter the Array size ");
	    n=scan.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Please Enter the elements of array");
	    for(int i=0;i<n;i++) {
	    	arr[i]=scan.nextInt();
	    }
	    
	    SortingArray sort=new SortingArray();
	    sort.ascendingOrder(arr);

	 }
	
	public void ascendingOrder(int arr[]) {
		;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;i++) {
				if(arr[j]<arr[i]) {
					arr[i]=arr[j];
					
				}
				
			}
			
		}
		
		System.out.println("The Sorted Array is given by ...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}
	}
	
}
