package com.lifujian.sword.FilterPattern.Criteria.Impl;

import com.lifujian.sword.FilterPattern.Criteria.Criteria;
import com.lifujian.sword.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(java.util.List<Person> persons) {
		List<Person> femalePersons = new ArrayList<>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("female")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
