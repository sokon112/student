package sequence;

public class MemberVO {
	private int userNo;
	private String userName;
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public MemberVO(int userNo, String userName) {
		super();
		this.userNo = userNo;
		this.userName = userName;
	}
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MemberVO [userNo=" + userNo + ", userName=" + userName + "]";
	}
	
}
