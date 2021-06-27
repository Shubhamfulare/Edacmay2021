/*Q1.Create two classes named Mammals and MarineAnimals.
Create another class named BlueWhale which inherits both the
above classes. Now, create a function in each of these classes
which prints "I am mammal", "I am a marine animal" and "I
belong to both the categories: Mammals as well as Marine
Animals" respectively. Now, create an object for each of the
above class and try calling
1 - function of Mammals by the object of Mammal
2 - function of MarineAnimal by the object of MarineAnimal
3 - function of BlueWhale by the object of BlueWhale
4 - function of each of its parent by the object of BlueWhale*/


class mammals{
	int a;
	public void func() {
		System.out.println("I am mammal");
	}
}	
class marineAnimals extends mammals{
	public void func2() {
			System.out.println("I am a marine animal");
		}
}	
class blueWhale extends marineAnimals{
		public void func3() {
			System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
		}
}
public class MammalsExample {

	public static void main (String[] args) {
		mammals ms=new mammals();
		ms.func();
		
		marineAnimals ma=new marineAnimals();
		ma.func2();
		
		blueWhale bw=new blueWhale();
		bw.func3();
		
		blueWhale mb=new blueWhale();
		mb.func();
	}
}
