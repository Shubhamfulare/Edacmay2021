/*Make a class named Fruit with a data member to calculate the
number of fruits in a basket. Create two other class named
Apples and Mangoes to calculate the number of apples and
mangoes in the basket. Print the number of fruits of each type
and the total number of fruits in the basket.*/

class fruit{
	public int getNumber(int a,int b) {
	int res=a+b;
	return res;
	}
	
}
class mangoes extends fruit{
	void display() {
		System.out.println("");
	}
} 
class apples extends fruit{
	
}
public class Fruits {

	public static void main(String[] args) {
		

	}

}
