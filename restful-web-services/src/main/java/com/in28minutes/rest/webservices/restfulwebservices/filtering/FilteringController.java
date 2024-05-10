package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filter")
	public MappingJacksonValue getValues() {
		SomeBean someBean = new SomeBean("Value 1", "Value 2", "Value 3");
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
		SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filter = new SimpleFilterProvider().addFilter("SomeBeanFilter", simpleBeanPropertyFilter);
		mappingJacksonValue.setFilters(filter);
		return mappingJacksonValue;
	}
	
	@GetMapping("/filter-list")
	public MappingJacksonValue getList() {
		List<SomeBean> someBean = Arrays.asList(new SomeBean("Value 1", "Value 2", "Value 3"), new SomeBean("Value 1", "Value 2", "Value 3"), new SomeBean("Value 1", "Value 2", "Value 3"));
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
		SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		FilterProvider filter = new SimpleFilterProvider().addFilter("SomeBeanFilter", simpleBeanPropertyFilter);
		mappingJacksonValue.setFilters(filter);
		return mappingJacksonValue;
	}
}
