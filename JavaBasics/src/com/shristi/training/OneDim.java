package com.shristi.training;

public class OneDim {

	public static void main(String[] args) {
		int[][] nums = new int[3][2];
		System.out.println(nums.length);
		System.out.println(nums[0][0]);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < 2; j++) {
				nums[i][j] = 20;
			}
		}
		System.out.println(nums.length);
		int sum = 0;
		for (int num[] : nums) {
			for (int value : num) {
				System.out.print(value + " ");
				sum += value;
			}
			System.out.println();
		}
		System.out.println(sum);

	}
}
