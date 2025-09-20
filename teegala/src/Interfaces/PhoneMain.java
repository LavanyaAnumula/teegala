package Interfaces;

public class PhoneMain {

	public static void main(String[] args) {
		Jio j = new Jio();
		j.call();
		j.sms();
		
		Samsung sm = new Samsung();
		sm.call();
		sm.sms();
	}

}
