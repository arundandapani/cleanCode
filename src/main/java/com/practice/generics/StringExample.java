
package com.practice.generics;

public class StringExample<String extends Object> extends AbstractAcceptor<String, Integer> {

	@Override
	public void someThing(String obj) {
		System.out.println(obj);

	}

	@Override
	public Integer getValue() {
		return null;
	}

	@Override
	public void printValue(Integer obj) {

	}


}
