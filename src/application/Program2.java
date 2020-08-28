package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1 - INSERT ===");
		Department dp = new Department(null, "Music");
		departmentDao.insert(dp);
		
		System.out.println("=== TEST 2 - UPDATE ===");
		dp.setId(5);
		dp.setName("food");
		departmentDao.update(dp);
		
		System.out.println("=== TEST 3 - DELETE BY ID ===");
		departmentDao.deleteById(6);
		
		
		
	
	}
	

}
