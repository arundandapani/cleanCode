package com.practice.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateArrayByNTest {

	@Test
	public void testInput(){
		int[] num = {1,2,3,4,5,6,7};
		RotateArrayByN rotateArrayByN = new RotateArrayByN();
		rotateArrayByN.rotateArray(num, 3);
		Assert.assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(num));
	}

	@Test
	public void testWithNumberBiggerThanLength(){
		int[] num = {1,2,3,4,5,6,7};
		RotateArrayByN rotateArrayByN = new RotateArrayByN();
		rotateArrayByN.rotateArray(num, 8);
		Assert.assertEquals("[7, 1, 2, 3, 4, 5, 6]", Arrays.toString(num));

	}

}