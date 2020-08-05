package yms.offshore.demo.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yms.offshore.demo.core.model.Country;
import yms.offshore.demo.core.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {
	@Autowired
	private CountryRepository repository;

    @Override
    public List<Country> findAll() {
        return (List<Country>) repository.findAll();
    }

	@Override
	public List<Country> findByIdCustom(Long id) {
		return repository.findByIdCustom(id);
	}

}
