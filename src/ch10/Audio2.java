package ch10;

public abstract class Audio2 implements RemoteControll {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

//	@Override
//	public void turnOff() {
//		System.out.println("Audio를 끕니다.");
//
//	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControll.MAX_VOLUME) {
			this.volume = RemoteControll.MAX_VOLUME;
		}else if(volume<RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : "+this.volume);
	}

}
