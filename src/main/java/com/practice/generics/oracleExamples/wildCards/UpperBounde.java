package com.practice.generics.oracleExamples.wildCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpperBounde {

	private List<? extends Number> genericList = new ArrayList<>();

	public void process(List<? extends Number> genericList) {
		for (Number eachNumber : genericList) {
			System.out.println(eachNumber);
		}
	}

	public static void main(String[] args) {
		UpperBounde upperBounde = new UpperBounde();
		upperBounde.process(Collections.singletonList(10));
		upperBounde.process(Collections.singletonList(10.0));
	}
}
