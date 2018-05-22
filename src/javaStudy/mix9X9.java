package javaStudy;
import java.util.Scanner;

public class mix9X9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please input 1-9");
		int num = sc.nextInt();
		
		Mix9x9(num);
		
	}
	
	public static void Mix9x9(int a) {
		for(int i=1;i<=a;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
				
			}
			System.out.println();
		}
	}
}
