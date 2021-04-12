package ch8;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		work(employee);
		
		Employee ceo = new Ceo();
//		Ceo ceo = new Ceo();
		ceo.setName("강호동");
		ceo.setPosition("사장");
		work(ceo); // Employee employee = ceo;
		
		 
		Employee admin = new Admin();
//		Admin admin = new Admin();
		admin.setName("정우성");
		admin.setPosition("관리자");
		work(admin); // Employee employee = admin;
		
		Employee part = new PartTime();
//		PartTime part = new PartTime();
		part.setName("송혜교");
		part.setPosition("시간제");
		work(part); // Employee employee = part;
	}
	
	public static void work(Employee employee) {
		employee.work();
	}

}
