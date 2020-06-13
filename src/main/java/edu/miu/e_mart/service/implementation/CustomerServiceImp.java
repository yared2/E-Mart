package edu.miu.e_mart.service.implementation;

import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.miu.e_mart.domain.Customer;
import edu.miu.e_mart.service.definition.ICustomerService;
@Service
public class CustomerServiceImp implements ICustomerService {

	@Override
	public <S extends Customer> S save(S entity) {

		return null;
	}

	@Override
	public <S extends Customer> Iterable<S> saveAll(Iterable<S> entities) {

		return null;
	}

	@Override
	public Optional<Customer> findById(Long id) {

		return null;
	}

	@Override
	public boolean existsById(Long id) {

		return false;
	}

	@Override
	public Iterable<Customer> findAll() {

		return null;
	}

	@Override
	public Iterable<Customer> findAllById(Iterable<Long> ids) {

		return null;
	}

	@Override
	public long count() {

		return 0;
	}

	@Override
	public void deleteById(Long id) {

		
	}

	@Override
	public void delete(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Customer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
