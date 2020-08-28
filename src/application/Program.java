package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

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
		
		
		System.out.println("\n\n=== TEST 4: SELLER Insert====");
		Seller sell = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4500.00, dp);
		sellerDao.insert(sell);
		System.out.println("Inserted!" + sell.getId());
		
		
		System.out.println("\n\n=== TEST 5: SELLER Update====");
		seller = sellerDao.findById(1);
		seller.setName("Matha Waine");
		sellerDao.update(seller);
		
		System.out.println(sellerDao.findById(1));
		
		
		System.out.println("\n\n=== TEST 6: SELLER delete====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete completed!");
		
		
	}
	
}
