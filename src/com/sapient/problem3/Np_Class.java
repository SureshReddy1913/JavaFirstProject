package com.sapient.problem3;

import java.util.Scanner;

public class Np_Class {

	public static void main(String[] args) {
		
		Num_Process[] np=new Num_Process[4];
		np[0] = (a,b)->(a+b);
		np[1] = (a,b)->(a-b);
		np[2] = (a,b)->(a*b);
		np[3] = (a,b)->(a/b);
		
		System.out.println("Enter two numbers to be caluclated and the operation choice:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int choice=sc.nextInt();
				System.out.println("ans="+np[choice].cal(a, b));
		
	}

}
