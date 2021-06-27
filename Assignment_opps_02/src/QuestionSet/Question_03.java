package QuestionSet;

/*How to find repeated numbers in an array if it contains
multiple duplicates?*/

public class Question_03 {

	public static void main(String[] args) {
		int arr[]= {4,2,2,6,9,4,8};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Duplicate number is "+arr[j]);
				}
				
						
			}
		}
	}

}
