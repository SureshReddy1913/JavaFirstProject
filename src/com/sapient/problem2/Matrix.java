package com.sapient.problem2;

import java.util.Scanner;

public class Matrix {
	
	int [][]matrix;
	
	public Matrix(int size)
	{
		matrix=new int[size][size];
	}
	
	public Matrix()
	{
		matrix=new int[3][3];
	}
	
	public Matrix(int [][]matrix)
	{
		this.matrix=matrix;
	}
	
	public Matrix(Matrix that)
	{
		this.matrix=that.matrix;
	}
	
	public void readMatrix()
	{
		System.out.println("Enter "+ matrix.length +" sized matrix ");
		Scanner scanner=new Scanner(System.in);
		int a;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				a=scanner.nextInt();
				matrix[i][j]=a;
			}
		}
	}
	
	public void display()
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void display(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	int[][] addMatrices(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				matrix[i][j]+=this.matrix[i][j];
			}
		}
		return matrix;
	}
	
	boolean checkScalarMatrix()
	{
		int ele=matrix[0][0];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i==j)
				{
					if(matrix[i][j]!=ele) return false;
				}
				else
				{
					if(matrix[i][j]!=0) return false;
				}
			}
		}
		return true;
	}
	
	int[][] multiplyMatrix(int[][] matrix)
	{
		int c[][]=new int[matrix.length][matrix.length];
			for(int i=0;i<matrix.length;i++)
			{  
				for(int j=0;j<matrix.length;j++)
				{    
					c[i][j]=0;      
					for(int k=0;k<matrix.length;k++)      
					{      
							c[i][j]+=this.matrix[i][k]*matrix[k][j];      
					} 
				}    
			}
		return c;	
	}

}
