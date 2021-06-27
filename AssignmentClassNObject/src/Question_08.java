import java.util.Scanner;

/*Print the average of three numbers entered by user by creating a class named 'Average' having a
method to calculate and print the average.*/
class Average{
	int avg;
	public Average(int a,int b,int c) {
		avg =(a+b+c)/3;
		System.out.println("avg : "+avg);
	}
}
public class Question_08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number : ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
	
		Average re=new Average(a,b,c);
		
	}

}