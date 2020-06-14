package edu.miu.e_mart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.e_mart.domain.Customer;
@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer >{

}
