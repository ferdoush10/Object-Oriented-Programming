package oop.solid;

// when two classes are talking to each other, then they should have the smallest possible 
// interface that is defined. 

/* the dependency of one class to another one should depends on the smallest possible interface.
   clients should not be forced to implements the interfaces that they don't use.
 */

interface Animal {
	void feed();
	void groom();
}

class Dog implements Animal{
	public void feed() {
		System.out.println("Dog feeding..");
	}
	
	public void groom() {
		System.out.println("Dog is grooming..");
	}
}

class Tiger implements Animal {
	public void feed() {
		System.out.println("Tiger feeding..");
	}
	//Tiger is not grooming. we need to dummy implementation just because of compiler happy.
	public void groom() {
		
	}
}
public class InterfaceSegregession {

	public static void main(String[] args) {
		

	}

}
