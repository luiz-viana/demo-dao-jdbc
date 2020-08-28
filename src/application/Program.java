package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: SELLER findByID ====");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n\n=== TEST 2: SELLER findByDepartment ====");
		Department dp = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dp);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n\n=== TEST 3: SELLER findAll====");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		
	}
	
}
