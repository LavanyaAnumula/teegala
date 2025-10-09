package Jdbc.executor;

import Jdbc.services.CurdOperations;

public class JDBCMain {

	public static void main(String[] args) {
		CurdOperations.addStudent(101, "Neetha");
		CurdOperations.addStudent(102, "preethi");
		CurdOperations.addStudent(103, "Ramu");

	}

}