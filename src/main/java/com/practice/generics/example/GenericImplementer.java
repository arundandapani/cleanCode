
package com.practice.generics.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericImplementer<String> extends GenericAbstract<String, String> {

	@Override
	public void printAbstract(String value) {
		List<? extends String> sampleList = new ArrayList<>();
		//sampleList.add("Arun");


	}

	public static <T,G> List<G> fromArrayToList(T[] a, Function<T,G> mapper){
		return Arrays.stream(a)
				.map(mapper)
				.collect(Collectors.toList());

	}

	@Override
	public void print(String alue) {

	}

}
