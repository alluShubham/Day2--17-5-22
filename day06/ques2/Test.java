package com.masai.day06.ques2;

public class Test {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int N,M=3;
		
		for (int i = 0; i < arr.length; i++) {
			int sum =0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j][i]%2==0) {
					sum+=arr[j][i];
				}
			}
			System.out.println(sum);
		}
	}
}
