package yms.offshore.demo.core.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import yms.offshore.demo.core.model.Country;
import yms.offshore.demo.core.service.CountryService;

@RestController
public class TestController {
	@Autowired
	private CountryService countryService;
	 
	@GetMapping("/test")
	public Response test() {
		Response r = new Response();
		List<Country> countries = countryService.findByIdCustom(Long.valueOf(1));
		HashMap<String, Integer> countriesMap = new HashMap<String, Integer>();
		
		for (Country country : countries) {
			countriesMap.put(country.getName(),country.getPopulation());
		}
		r.setCode("Đẹp trai");
		r.setData(countriesMap);
		return r;
		
	}
	
	class Response {
		private String code;
		private HashMap<String,Integer> data;
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public HashMap<String, Integer> getData() {
			return data;
		}
		public void setData(HashMap<String, Integer> countriesMap) {
			this.data = countriesMap;
		}
		
	}
}
