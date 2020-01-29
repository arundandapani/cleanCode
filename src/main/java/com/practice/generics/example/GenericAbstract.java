/*
 * Copyright 2020 Mentor Graphics Corporation
 * All Rights Reserved
 *
 * THIS WORK CONTAINS TRADE SECRET AND PROPRIETARY INFORMATION
 * WHICH IS THE PROPERTY OF MENTOR GRAPHICS CORPORATION
 * OR ITS LICENSORS AND IS SUBJECT TO LICENSE TERMS.
 */
package com.practice.generics.example;

public abstract class GenericAbstract<T,R>  implements GenericInterface<R>{
		public abstract void printAbstract(T value);
}
