package ch10;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControll remote = new Television();
		remote.turnOn();
		remote.turnOff();
		
		remote = new Audio();
		remote.turnOn();
		remote.setVolume(12);
		remote.turnOff();
		
		RemoteControll rc = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("trun on");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("trun off");				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("volume Control"+volume);				
				
			}
		};
		
		
		rc.setMute(true);
		rc.setVolume(10);
		rc.turnOff();
	}
}
