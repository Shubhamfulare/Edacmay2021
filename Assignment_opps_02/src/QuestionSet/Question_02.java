package QuestionSet;

/*How to find the largest and smallest number in an unsorted
array?*/

public class Question_02 {

	public static void main(String[] args) {
		int arr[]= {4,2,3,6,9,5,8};
		
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}for(int i=1;i<arr.length;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(min+" "+max);
	}

}
