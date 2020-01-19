package com.practice.generics;

public abstract class AbstractAcceptor<T, R> implements Acceptor<R>{

	public abstract void someThing(T obj);
}
