package oop;

class test{
	public void show() {             // overloading, static polymorphism, early binding, 
		                            // compile time.
		System.out.println("hello show");
	}
	
	public void show(int number) {
		System.out.println("hello show number");
	}
	
	public void show(char ch) {
		System.out.println("hello show char");
	}
	
	public void show(int i, int j) {
		System.out.println("hellow two number show");
	}
}
public class MainClass {

	public static void main(String[] args) {
		
         test obj = new test();
         obj.show(5, 10);
	}

}
