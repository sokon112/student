package ch10;

public class Television implements RemoteControll {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControll.MAX_VOLUME) {
			this.volume = RemoteControll.MAX_VOLUME;
		}else if(volume<RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}

}
