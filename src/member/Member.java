package member;

public class Member {
	private int id;
	private String name;
	private String addr;
	private String email;
	private String nation;
	private int age;
	
	public Member() {
		super();
	}

	public Member(int id, String name, String addr, String email, String nation, int age) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.email = email;
		this.nation = nation;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id+", name="+name+", addr="+addr+", email="+email+", nation="+nation+", age="+age+"]";
	}
	
}
