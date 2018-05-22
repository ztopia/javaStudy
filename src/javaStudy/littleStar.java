package javaStudy;
import java.util.Scanner;

public class littleStar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("row");
		int row=sc.nextInt();
		System.out.println("columm");
		int colum=sc.nextInt();		
		
		print(row,colum);
		
	}
	
	public static void print(int a,int b) {
		for(int i=1;i<=a;i++) {
			for (int j=1;j<=b;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
