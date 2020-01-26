package com.practice.matrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MatrixSpinalTest {

	@Test
	public void testMatrix(){
		int matrix[][] = new int[4][4];
		int count = 1;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = count;
				count++;
			}

		MatrixSpinal matrixSpinal = new MatrixSpinal();
			List result = Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
		Assert.assertArrayEquals(result.toArray(), matrixSpinal.getSpinalOrder(matrix).toArray());
	//	Assert.assertTrue(Arrays.asList("[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]").equals(Arrays.asList(matrixSpinal.getSpinalOrder(matrix))));

	}

}