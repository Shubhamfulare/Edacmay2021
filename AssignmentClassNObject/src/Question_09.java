import java.util.Scanner;

/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
with separate methods for each operation whose real and imaginary parts are entered by user.*/

class Complex{
	int sum;
	int diffrence;
	int product;
	public void Sum(int a,int b) {
		sum=a+b;
		System.out.println("sum of number : "+sum);
	}
	public void Difference(int a,int b) {
		diffrence=a-b;
		System.out.println("diffrence of number : "+diffrence);
	}
	public void Product(int a,int b) {
		product=a*b;
		System.out.println("product of number : "+product);
	}
} 
public class Question_09 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number : ");
		int a=s.nextInt();
		int b=s.nextInt();
		Complex c=new Complex();
		c.Sum(a, b);
		c.Difference(a, b);
		c.Product(a, b);
		
	}

}
