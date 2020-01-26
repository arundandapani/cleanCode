package com.practice.matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpinal {

	public List<Integer> getSpinalOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		int rowC = 0;
		int rowB = matrix.length;
		int columnC = 0;
		int columnB = matrix[0].length;
		while (true) {
			for (int i = rowC; i < rowB; i++) {
				result.add(matrix[rowC][i]);
			}
			rowC++;
			if (checkOutBoundary(rowC, rowB, columnC, columnB)) {
				break;
			}
			for (int i = rowC; i < columnB; i++) {
				result.add(matrix[i][columnB - 1]);
			}
			columnB--;
			if (checkOutBoundary(rowC, rowB, columnC, columnB)) {
				break;
			}

			for (int i = columnB - 1; i >= columnC; i--) {
				result.add(matrix[rowB - 1][i]);
			}
			rowB --;
			if (checkOutBoundary(rowC, rowB, columnC, columnB)) {
				break;
			}
			for(int i=rowB -1; i>=rowC; i--){
				result.add(matrix[i][columnC]);
			}
			columnC ++;
			if (checkOutBoundary(rowC, rowB, columnC, columnB)) {
				break;
			}
			for(int i=columnC; i<columnB; i++){
				result.add(matrix[rowC][i]);
			}
			rowC++;
			if (checkOutBoundary(rowC, rowB, columnC, columnB)) {
				break;
			}

		}


		return result;
	}

	private boolean checkOutBoundary(int rowC, int rowB, int columnC, int columnB) {
		return (rowC > rowB) || (columnC > columnB);
	}

	public static void main(String[] args) {
		int matrix[][] = new int[4][4];
		int count = 1;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = count;
				count++;
			}

		MatrixSpinal matrixSpinal = new MatrixSpinal();
		matrixSpinal.getSpinalOrder(matrix);
	}
}
