package user2;

public class UserVO {
	private int no;
	private String username;
	private int birthYear;
	private String addr;
	private String mobile;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public UserVO(int no, String username, int birthYear, String addr, String mobile) {
		super();
		this.no = no;
		this.username = username;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserVO [no=" + no + ", username=" + username + ", birthYear=" + birthYear + ", addr=" + addr
				+ ", mobile=" + mobile + "]";
	}
	
	
}
