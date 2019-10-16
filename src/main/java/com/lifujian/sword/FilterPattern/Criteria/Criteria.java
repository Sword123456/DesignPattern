package com.lifujian.sword.FilterPattern.Criteria;

import com.lifujian.sword.FilterPattern.Person;

import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
