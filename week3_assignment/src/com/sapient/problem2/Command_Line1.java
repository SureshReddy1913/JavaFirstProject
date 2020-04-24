package com.sapient.problem2;

public class Command_Line1 {
	
	int[] data;
	public void setData(String[] args)
	{
		data=new int[args.length];
		for(int i=0;i<args.length;i++) {
			data[i]=Integer.parseInt(args[i]);
		}
	}
	
	public void displayData()
	{
		System.out.print("Data we have is:");
		for(int data1:data)
		{
			System.out.print(" "+data1);
		}
		System.out.print("\n");
	}
	
	public void calData()
	{
		int sum=0,max=0,min=Integer.MAX_VALUE;
		for(int data1:data)
		{
			sum=sum+data1;
			if(data1<min)
			{
				min=data1;
			}
			if(data1>max)
			{
				max=data1;
			}
		}
		int avg= sum/data.length;
		System.out.println("Sum of the data is: "+sum);
		System.out.println("Average of the data is: "+avg);
		System.out.println("Maximum of the data is: "+max);
		System.out.println("Minimum of the data is: "+min);
	}
}
