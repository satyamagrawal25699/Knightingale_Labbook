package Labbookexamples;
import java.util.Scanner;


public class locationofElement {
	public static void main(String[] args) {
		int n;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of array ");
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the element you want to locate ");
		int ele=scan.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				System.out.println("The location of element is "+i);
			}
		}
		
	}
}
