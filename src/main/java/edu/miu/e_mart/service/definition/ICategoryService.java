package edu.miu.e_mart.service.definition;

import org.springframework.beans.factory.annotation.Autowired;

import edu.miu.e_mart.domain.Category;
import edu.miu.e_mart.repository.ICategoryRepository;

public interface ICategoryService  {
	void save(Category category) ;
		
	

}
