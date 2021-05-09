package com.mtl.spring.dao;

import java.util.List;

import com.mtl.spring.entity.Company;

public interface CompanyDao {

	Integer save(Company company);

	void update(Company company);

	Company findById(Integer id);

	void deleteById(Integer id);

	void deleteAll();

	List<Company> findAll();
}