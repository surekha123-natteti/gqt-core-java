package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
//		int value=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((i+j)%2+" ");
//				value++;
			}
			System.out.println();
		}

	}

}
