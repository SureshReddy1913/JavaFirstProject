package com.sapient.problem2;

import java.util.Scanner;

public class Runner_class {
	
	public static void main(String[] args) {
		Command_Line1 cl=new Command_Line1();
		cl.setData(args);
		cl.displayData();
		cl.calData();
		
		KeyRead_Line2 kl=new KeyRead_Line2();
		kl.readData();
		kl.displayData();
		kl.sort_fun();
		kl.find();
		
		System.out.print("Enter the figure to be converted to words:");
		Scanner scanner = new Scanner(System.in);
		int d=scanner.nextInt();
		System.out.println(Conversion.fig_to_words(d)+" only");
	}
}
