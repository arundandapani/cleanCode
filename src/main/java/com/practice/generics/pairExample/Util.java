/*
 * Copyright 2020 Mentor Graphics Corporation
 * All Rights Reserved
 *
 * THIS WORK CONTAINS TRADE SECRET AND PROPRIETARY INFORMATION
 * WHICH IS THE PROPERTY OF MENTOR GRAPHICS CORPORATION
 * OR ITS LICENSORS AND IS SUBJECT TO LICENSE TERMS.
 */
package com.practice.generics.pairExample;

public class Util {

	public static<K, V> boolean compare(Pair<K,V> obj1, Pair<K,V> obj2){
		return ((obj1.getKey().equals(obj2.getKey())) &&
				(obj1.getValue().equals(obj2.getValue())));
	}

}
