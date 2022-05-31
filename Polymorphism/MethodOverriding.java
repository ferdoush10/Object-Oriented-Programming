package oop;

class A{
	public void show() {
		System.out.println("show in A");
	}
}

class B extends A{
	public void show() {           // method overriding, runtime, late binding, dynamic binding
		System.out.println("show in B");
	}
}

class C extends B{
	
}

class D extends A{
	
}
public class MainClass {

	public static void main(String[] args) {
		
       A obj = new D();
       obj.show();
        
       A obj2 = new C();
       obj2.show();
	}

}
