package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	
	void update(Department obj);
	
	void deletebyId(Integer id);
	
	Department findbyId(Integer id);
	
	List<Department> findall();
	
	List<Department> findById(Integer id);
}
