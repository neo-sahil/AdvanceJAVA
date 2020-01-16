package com.sahil;
import com.sahil.*;
public class Student {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		dao.getConnection();
		StudentDE s1 = dao.getStudent(6);
		System.out.println(s1.getUname());
		
	}

}
