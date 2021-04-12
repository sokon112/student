package ch8;


public class LGTV {
	
	SamsungSpeaker speaker;
	
	//초기화 - 생성자 이용.
	public LGTV(SamsungSpeaker speaker) {
		super();
		this.speaker = speaker;
	}
	
	//초기화 - setter 이용.
	public void setSpeaker(SamsungSpeaker speaker) {
		this.speaker = speaker;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕 니다.");
	}
}
