package oop;

//abstract class and abstract method
//forcefully assign some method to override or implement

abstract class RonyPhone{ //abstract class, can't able to create object.
	public void makeText() {
		System.out.println("Text a message...");
	}
	
    public abstract void makeAudioCall();
    public abstract void makeViodCall();
    public abstract void playSong();
}

abstract class sazidPhone extends RonyPhone{  //abstract class, can't able to create object.
	public void makeAudioCall() {
		System.out.println("Audio calling.......");
		
	}
}

abstract class RejaulPhone extends sazidPhone{ //abstract class, can't able to create object.
	public void makeViodCall() {
		System.out.println("Vidio Calling........");
	}
}

class KamrulPhone extends RejaulPhone{ //concrete class. able to create object.
	public void playSong() {
		System.out.println("Singing....");
	}
}

public class MainClass {

	public static void main(String[] args) {
		RonyPhone phone = new KamrulPhone();
		phone.playSong();
		
		KamrulPhone kphone = new KamrulPhone();
		kphone.makeViodCall();
	}

}
