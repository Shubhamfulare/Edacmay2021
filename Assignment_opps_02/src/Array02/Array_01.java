package Array02;

/*If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
60], your program should be able to find that the
subarray lies between the indexes 3 and 8.*/


public class Array_01 {

	public static void main(String[] args) {
		int arr1[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50,60};
		for(int i=0;i<arr1.length;i++) {
			if(i<3 || i>8) {
				continue ;
			}else {
				System.out.print(arr1[i]+" ");
			}
		}
	}

}
