package kimseokhyunTest;
//문제 2
public class IPTV extends ColorTV {
	String ipAddr;

	public IPTV(int size, int color, String ipAddr) {
		super(size, color);
		this.ipAddr = ipAddr;
	}
	
	@Override
	void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러",ipAddr,getSize(),color);
	}
	
}
