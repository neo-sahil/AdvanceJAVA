package com.sahil;
import java.util.*;

public class StudentADD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		StudentDE s1 = new StudentDE();
		System.out.println("Enter the name of the student\n");
		String name = sc.nextLine();
		s1.setId(6);
		s1.setUname(name);
		dao.getConnection();
		dao.addStudent(s1);
		
	}

}
