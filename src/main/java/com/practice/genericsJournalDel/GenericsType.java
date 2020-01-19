package com.practice.genericsJournalDel;

public class GenericsType<T> {

	private T t;

	public T get(){
		return this.t;

	}

	public void set(T t1){
		t = t1;
	}

	public static <T extends Comparable<T>> int compare(T t1, T t2){
		return t1.compareTo(t2);
	}

}
