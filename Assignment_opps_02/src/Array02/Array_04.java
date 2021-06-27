package Array02;

/*Write a program to find all pairs on an integer array whose sum
is equal to a given number?*/


public class Array_04 {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,3,6,3,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]+arr[j]==6 ||arr[i]+arr[j]==7) {
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
		}
	}

}
