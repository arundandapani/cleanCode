
package com.practice.generics;

import java.util.List;
import java.util.Set;

public class IntegerExample<Integer extends Object> extends AbstractAcceptor<Integer, Double>  {

	@Override
	public void someThing(Integer obj) {

	}

	@Override
	public Double getValue() {
		return null;
	}

	@Override
	public void printValue(Double obj) {

	}

	private<T extends String> List<String> checkSomething(Set<T> value){
		System.out.println(value.size());
		return null;
	}
}
