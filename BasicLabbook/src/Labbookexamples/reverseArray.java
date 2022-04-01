package Labbookexamples;
import java.util.Scanner;

public class reverseArray {
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
		
		for(int i=0;i<n;i++) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse Array is ");
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		
		
		
	}
}
