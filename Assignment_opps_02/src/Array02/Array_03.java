package Array02;

/*Write a program to shift every element of an array to
circularly right.*/

public class Array_03 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			int temp=arr[arr.length-1];
				
		for(int j=3;j>=0;j--) {
			arr[j+1]=arr[j];
		}
		
		arr[0]=temp;
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		}

	}

}
