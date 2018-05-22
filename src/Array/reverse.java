package Array;

public class reverse {
	public static void main (String[] args) {
		int[] arr= {1,5,8,1,3,5};
		reverse(arr);
		
	}
	
	public static void reverse(int[] arr) {
		for (int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		
	}
	
	
}
