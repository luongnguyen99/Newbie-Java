package yms.offshore.demo.core.service;

import java.util.List;

import yms.offshore.demo.core.model.Country;
public interface ICountryService {
	List<Country> findAll();
	
	List<Country> findByIdCustom(Long id);
	
}
