import java.util.Arrays;

/*Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number
for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of
depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that
depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that
depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total
number of transactions.*/


import java.util.*;
class Bank{
	String nameofDepositor;
	String addressOfDepositor;
	String typeOfAccount;
	int Balance;
	int numberOfTransactions;
}
class BankAccount extends Bank{
	  
	 public void addAccount(){
		 System.out.println("Enter name ,address, type of account :");
		 nameofDepositor=Myscanner.getString("Enter your name :");
		 addressOfDepositor=Myscanner.getString("Enter your address");
		 typeOfAccount=Myscanner.getString("type of account (saving/current) :");
	 } 
	 public void displayBalance(){
		 
	 }
	 public void deposit(){
		 
	 }
	 public void withdraw(){
		 
	 }
	 public void changeAddress(){
		 
	 }
}
class Input {
	public void InputValue() {
		BankAccount sd=new BankAccount();
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(sd);
		
	do {
		int a=Myscanner.getInt("Enter the Choice :");
		switch(a){ 
		case 1:sd.addAccount();
		break;
		case 2:sd.displayBalance(); 
		break;
		case 3:sd.deposit();
		break;
		case 4:sd.withdraw(); ;
		break;
		case 5:sd.changeAddress(); 
		break;
		default :System.out.println("Wrong Input"); ;
		}
	   }while(true);
	}
}	
public class Question_04{

	public static void main(String[] args){
		Input add=new Input();
		add.InputValue();
	}

}
