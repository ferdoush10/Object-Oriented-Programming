package oop.solid;

// when two classes are talking to each other, then they should have the smallest possible 
// interface that is defined. 

/* the dependency of one class to another one should depends on the smallest possible interface.
   clients should not be forced to implements the interfaces that they don't use.
 */

interface Animal {
	void feed();
}

interface Peet extends Animal {
	void groom();
}

class Dog implements Peet{
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
	
}
public class InterfaceSegregession {

	public static void main(String[] args) {
		

	}

}
