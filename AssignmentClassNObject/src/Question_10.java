/*Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/
class Employee{
	String name;
	int yearofjoining;
	String address;
	public Employee(String Name,int yr,String add) {
		name=Name;
		yearofjoining=yr;
		address=add;
		System.out.println(name+"      "+yearofjoining+"              "+address);
	}
}
public class Question_10 {

	public static void main(String[] args) {
		System.out.println("Name     Year of joning         Address");
		new Employee("Robert",1994,"64C- WallsStreat");
		new Employee("Sam   ",2000,"68D- WallsStreat");
		new Employee("John  ",1999,"26B- WallsStreat");

	}

}
