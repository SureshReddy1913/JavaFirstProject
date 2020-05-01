package com.sapient.problem1;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {
	
	int[] array;
	
	public Int_Arr_Process(int size)
	{
		array=new int[size];
	}
	
	public Int_Arr_Process()
	{
		array=new int[10];
	}
	
	public Int_Arr_Process(int[] array)
	{
		this.array=array;
	}
	
	public Int_Arr_Process(Int_Arr_Process that)
	{
		this.array=that.array;
	}
	
	public void readArray()
	{
		System.out.println("enter " + array.length +" elements: ");
		Scanner scanner=new Scanner(System.in);
		int a;
		for(int i=0;i<array.length;i++)
		{
			a=scanner.nextInt();
			array[i]=a;	
		}
	}
	
	public void display()
	{
		System.out.println("Horizontal Display-->");
		for(int ele:array)
		{
			System.out.print(ele+" ");
		}
		System.out.println("\nVertical Display-->");
		for(int ele:array)
		{
			System.out.println(ele);
		}
	}
	
	public void sortArray()
	{
		Arrays.sort(array);
	}
	
	public int biggestElement()
	{
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
	
	public int smallestElement()
	{
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		return min;
	}
	
	public int sum()
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		return sum;
	}
	
}
