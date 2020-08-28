package application;

import java.util.List;
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
		
		/*System.out.println("=== TEST 3 - DELETE BY ID ===");
		departmentDao.deleteById(6);*/
	
		
		System.out.println("=== TEST 4 - FIND BY ID ===");
		System.out.println(departmentDao.findById(3));
		
		
		System.out.println("=== TEST 5 - FIND ALL===");
		List<Department> list = departmentDao.findAll();
		
		for(Department d : list) {
			System.out.println(d);
		}
		
		
	
	}
	

}
