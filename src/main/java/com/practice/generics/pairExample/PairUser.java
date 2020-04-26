/*
 * Copyright 2020 Mentor Graphics Corporation
 * All Rights Reserved
 *
 * THIS WORK CONTAINS TRADE SECRET AND PROPRIETARY INFORMATION
 * WHICH IS THE PROPERTY OF MENTOR GRAPHICS CORPORATION
 * OR ITS LICENSORS AND IS SUBJECT TO LICENSE TERMS.
 */
package com.practice.generics.pairExample;

public class PairUser {

	public static void main(String[] args){
		Pair<String, Integer> pair = new Pair<>("Arun", 30);
		Pair<String, Integer> pair1 = new Pair<>("Arun", 30);
		Util.<String, Integer>compare(pair, pair1);

	}

}
