package oop;
//Encapsulation --> binding data with methods

class Account{
	int balance;
}

class SecureAccount{
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<0) {
			//we can manage access of users.
			System.out.println("You should enter a positive balance");
			return;
		}
		this.balance = balance;
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		
      //object knows something -> attribute, state
	  // object does something -> method, behaviour
	  
		
	  // when we give the access of variable to user, they can attempt any action, 
	  // which may haven't any meaning, or which is risky for our system.
	  Account maksud = new Account();
	  maksud.balance = -100;
	  System.out.println(maksud.balance);
	  
	  //variable should provide access to user only through getter and setters.
	  // in this way we can handle access of our user.
	  
	  SecureAccount rubel = new SecureAccount();
	  rubel.setBalance(100);
	  
	  System.out.println(rubel.getBalance());
	}

}
