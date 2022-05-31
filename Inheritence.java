package oop;

class calc{
	public int add(int i, int j) {
		return i + j;
	}
}

class advCal extends calc{
	public int sub(int i, int j) {
		return i - j;
	}
}

class veryAdvCal extends advCal{
	public int mul(int i, int j) {
		return i*j;
	}
}
public class MainClass {

	public static void main(String[] args) {
		
         veryAdvCal obj = new veryAdvCal();
         int result1 = obj.add(10, 20);
         System.out.println(result1);
	}

}
