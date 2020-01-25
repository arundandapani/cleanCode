package com.practice.arrays;

class RotateArrayByN {

	private void rotate(int[] num, int start, int end) {
		while (start < end) {
			int temp = num[start];
			num[start] = num[end - 1];
			num[end - 1] = temp;
			start++;
			end--;
		}
	}

	void rotateArray(int[] num, int k) {
		if (k > num.length) {
			k = k % num.length;
		}
		rotate(num, 0, num.length);
		rotate(num, 0, k);
		rotate(num, k, num.length);
	}
}
