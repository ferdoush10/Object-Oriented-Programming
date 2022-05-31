package oop;

//We can create of reference of abstract or interface, but we can create a obj of a class.

interface Phone{
	void showConfig();
}

class Iphone implements Phone {
	public void showConfig() {
		System.out.println("4GB Ram, 15MP camera, interlCore");
	}
}

class Samsung implements Phone {
	public void showConfig() {
		System.out.println("8GB Ram, 10MP camera, QuadCore");
	}
}

class phoneShow {
	public void show(Phone p) {
		p.showConfig();
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		Phone p = new Iphone();
		Phone p1 = new Samsung();
		phoneShow obj = new phoneShow();
		obj.show(p);
		obj.show(p1);
		
	}

}
