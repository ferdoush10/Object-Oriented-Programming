package oop.solid;


//A class should have one and only one reason to change
class Task {
	//this is not maintain single responsibility principle. because this class is responsible 
	//for more than one thing
	public void downloadFile(String location) {
		
	}
	public void ParseTheFile(File file) {
		
	}
	public void PersistData(Data data) {
		
	}
}
public class SingleResponsibility {

	public static void main(String[] args) {
		

	}

}
