package com.lifujian.sword.FilterPattern.Criteria.Impl;

import com.lifujian.sword.FilterPattern.Criteria.Criteria;
import com.lifujian.sword.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(java.util.List<Person> persons) {
		List<Person> femalePersons = new ArrayList<>();
		for (Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("single")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
