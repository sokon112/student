package ch10;

public class MySqlDao implements DataAccessObject {

	private String name ="MySql";
	@Override
	public void select() {
		System.out.printf("%s DB에서 검색\n",name);
	}

	@Override
	public void insert() {
		System.out.printf("%s DB에서 삽입\n",name);

	}

	@Override
	public void update() {
		System.out.printf("%s DB에서 수정\n",name);

	}

	@Override
	public void delete() {
		System.out.printf("%s DB에서 삭제\n",name);

	}

}
