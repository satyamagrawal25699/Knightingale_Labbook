package Labbookexamples;
import java.util.Scanner;

public class Primeornot {
	public static void main(String[] args) {
		int num;
		int flag=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=scan.nextInt();
		
		int m=num/2;
		for(int i=2;i<m;i++) {
			if(num%i==0) {
				System.out.println("Number is not prime");
				flag=1;
				break;
				
				
				
			}
		}
		
		
		if(flag==0) {
			System.out.println(+num+" Number is prime");
		}
		
		
		
		
		

		}
}
