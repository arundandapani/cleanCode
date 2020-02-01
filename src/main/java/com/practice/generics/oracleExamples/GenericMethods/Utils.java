
package com.practice.generics.oracleExamples.GenericMethods;


class Utils {

	public static <K, V> boolean compare(GenericMethodExample<K, V> obj1, GenericMethodExample<K, V> obj2) {

		return obj1.getKey().equals(obj2.getKey()) && obj1.getValue().equals(obj2.getValue());
	}
}