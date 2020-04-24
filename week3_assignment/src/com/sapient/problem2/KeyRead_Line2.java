package com.sapient.problem2;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2{
	int[] data;
	public void readData()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter data size: ");
		int n=scanner.nextInt();
		data=new int[n];
		System.out.print("Enter data: ");
		for(int i=0;i<n;i++)
		{
			int d=scanner.nextInt();
			if(d==-1) break;
			data[i]=d;
		}
	}
	
	public void displayData()
	{
		System.out.print("Entered data: ");
		for(int i=0;i<data.length;i++)
		{
			System.out.print(" "+data[i]);
		}
		System.out.print("\n");
	}
	
	public void sort_fun()
	{
		Arrays.sort(data);
		System.out.print("Sorted data: ");
		for(int i=0;i<data.length;i++)
		{
			System.out.print(" "+data[i]);
		}
		System.out.print("\n");
	}
	public void find()
	{
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the element to be searched: ");
		int f=scanner.nextInt();
		for(i=0;i<data.length;i++)
		{
			if(data[i]==f)
			{
				System.out.println("Found!");
				break;
			}
		}
		if(i==data.length)
		{
			System.out.println("Not Found!");
		}
	}

}
