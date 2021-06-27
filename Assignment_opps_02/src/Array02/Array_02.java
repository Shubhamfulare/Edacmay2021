package Array02;

/*Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. */


public class Array_02 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		int x=0;
		int y=0;
		for(int i=0;i<arr.length;i++){
			if(i<5) {
				arr1[x]=arr[i];
				x++;
			}
			else {
				arr2[y]=arr[i];
				y++;
			}	
		}
		for(int z :arr1)
			System.out.print(z+" ");
		System.out.println();
		for(int b :arr2)
			System.out.print(b+" ");
	}

}
