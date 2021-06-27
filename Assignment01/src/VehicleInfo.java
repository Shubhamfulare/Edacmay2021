/*We want to store the information of different vehicles. Create a
class named Vehicle with two data member named mileage and
price. Create its two subclasses
*Car with data members to store ownership cost, warranty (by
years), seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders,
number of gears, cooling type(air, liquid or oil), wheel
type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having
a data member to store the model type. Next, make two
subclasses Bajaj and TVS, each having a data member to store
the make-type.
Now, store and print the information of an Audi and a Ford car
(i.e. model type, ownership cost, warranty, seating capacity, fuel
type, mileage and price.) Do the same for a Bajaj and a TVS
bike.*/
class Vehicle{
	int mileage;
	int price;
	
}
class car extends Vehicle{
	int cost;
	int warrenty;
	int seatingCapacity;
	String fuelType;
	public void setDetails(int mileage,int price, int cost,int warrenty,int seatingCapacity,String fuelType) {
		this.cost=cost;
		this.warrenty=warrenty;
		this.seatingCapacity=seatingCapacity;
		this.fuelType=fuelType;
		this.mileage=mileage;
		this.price=price;
		}
	
}	
class bmw extends car {
	String modeltype;
	void setDetails(String modeltype) {
	this.modeltype=modeltype;
	}
    void getData(){
	System.out.println(mileage +" "+price+" "+cost +" "+ warrenty +" "+ seatingCapacity+" "+fuelType);
	}
}
class ford extends car {
	String modeltype;
	}

class bike extends Vehicle{
	int numberofcylinders;
	int numberofgears;
	String coolingtype;
	String wheeltype;
	int fueltanksize;
}
class bajaj extends bike {
	String  maketype;
}
class tvs extends bike{
	String  maketype;
}
public class VehicleInfo {

	public static void main(String[] args) {
			
		bmw obj=new bmw();
		obj.setDetails(10,1,5,1,4,"petrol");
		obj.getData();
		
//		 bike obj1=new tvs();
//		obj1.setDetails("xyx");
//		 car obj2=new bmw();
	}

}
