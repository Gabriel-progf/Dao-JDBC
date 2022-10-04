package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {


	void insert(Seller obj);
	
	void update(Seller obj);
	
	void deletebyId(Integer obj);
	
	List<Seller> findall();
}
