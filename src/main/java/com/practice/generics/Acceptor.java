
package com.practice.generics;

interface Acceptor<K> {

	public K getValue();
	public void printValue(K obj);

}
