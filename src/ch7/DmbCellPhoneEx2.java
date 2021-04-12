package ch7;

public class DmbCellPhoneEx2 {
	public static void main(String[] args) {
		
		DmbCellPhone2 dmb = new DmbCellPhone2("자바폰","black",7);
				
		dmb.powerOn();
		dmb.turnOnDmb();
		dmb.changeChannelDmb(8);
		dmb.turnOffDmb();
		dmb.bell();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("안녕하세요 고객님");
		dmb.hangUp();
				
	}
}
