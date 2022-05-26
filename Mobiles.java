package week1.day1;

public class Mobiles {

	public void makeCall() {
		System.out.println("Make call");
	}

	public void sendMsg() {
		System.out.println("Send Message");
	}

	public static void main(String[] args) {

		Mobiles mobile=new Mobiles();
		mobile.makeCall();
		mobile.sendMsg();
	}

}
