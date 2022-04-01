package Labbookexamples;
import java.util.Scanner;


public class AverageofNum {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		AverageofNum avgnum=new AverageofNum();
		System.out.println("Average of number is "+avgnum.aveg(n));
		
		
		
	}
	
	float aveg(int n) {
		int sum=0;
		float avg=0;
		for(int i=0;i<=n;i++) {
		
		 sum=sum+i;
		 
		}
		
		avg=sum/n;
		
		return avg;
		
		
		
	}
}
