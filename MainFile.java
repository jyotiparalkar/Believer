package com.sony.tv;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Remote remote = new Television();
        remote.powerOn();
        remote.powerOff();
        remote.volumeUP();
        remote.volumeDown();
        remote.changeChannel();
	}

}
interface Remote {
	
	abstract public void powerOn();
	abstract public void powerOff();
	abstract public void volumeUP();
	abstract public void volumeDown();
	abstract public void changeChannel();
}
class Television implements Remote{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("powerOn");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("powerOff");
	}

	@Override
	public void volumeUP() {
		// TODO Auto-generated method stub
		System.out.println("volumeUp");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("volumeDown");
	}

	@Override
	public void changeChannel() {
		// TODO Auto-generated method stub
		System.out.println("yes/no");
	}
	
}