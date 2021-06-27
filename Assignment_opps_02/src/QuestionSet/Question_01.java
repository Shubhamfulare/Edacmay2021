package QuestionSet;

/*How to find the missing number in an integer array of 1
to 100?*/

public class Question_01 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,8,9,10};
		int x=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==(x)) {
				x++;
			}
			else {
				System.out.println(x+" missing number");
				break;
			}
		}

	}

}
