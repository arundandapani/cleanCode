package com.practice.genericsJournalDel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {

	public static void main(String[] args) {
		String str = "abc";
		Object obj = new Object();
		obj=str; // works because String is-a Object, inheritance in java

		MyClass<String> myClass1 = new MyClass<String>();
		MyClass<Object> myClass2 = new MyClass<Object>();
		//myClass2=myClass1; // compilation error since MyClass<String> is not a MyClass<Object>
		obj = myClass1; // MyClass<T> parent is Object
	}

	public static void addIntegers(List<? super Integer> list){
		list.add(new Integer(50));
		Object object = new Object();
		//list.add(object);
		List<? extends Number> numbers = new ArrayList<Integer>();
		try(InputStream inputStream = new FileInputStream("a.txt")){

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class MyClass<T>{}

}