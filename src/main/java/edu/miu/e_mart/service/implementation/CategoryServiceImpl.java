package edu.miu.e_mart.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.e_mart.domain.Category;
import edu.miu.e_mart.repository.ICategoryRepository;
import edu.miu.e_mart.service.definition.ICategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements  ICategoryService{
	
	@Autowired
	private ICategoryRepository icatagoryRepository;

	@Override
	public void save(Category category) {
		icatagoryRepository.save(category);
	}
	
	

}