package com.sapient.problem1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class StudentRunner {
	public static void main(String[] args) throws StudentNotFoundException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=scanner.nextInt();
		Student[] st=new Student[n];
		System.out.println("Enter student details one by one:");
		for(int i=0;i<n;i++)
		{
			st[i]=new Student();
			int id=scanner.nextInt();
			st[i].setId(id);
			st[i].setName(scanner.next());
			st[i].setCity(scanner.next());
			
			//System.out.println("iteration done");
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i].getId()+" "+st[i].getName()+" "+st[i].getCity());
		}
		
		System.out.println("Enter the city name to be searched:");
		String city=scanner.next();
		for(int i=0;i<n;i++)
		{
			if(st[i].getCity().equals(city))
			{
				System.out.println(st[i].getId()+" "+st[i].getName());
			}
		}
		
		Arrays.sort(st, new Comparator<Student>() {
	        @Override
	        public int compare(Student o1, Student o2) {
	            return o1.getName().compareTo(o2.getName());
	        }
	    });
		System.out.println("Students details after sorting with name:");
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i].getId()+" "+st[i].getName()+" "+st[i].getCity());
		}
		
		Arrays.sort(st, new Comparator<Student>() {
	        @Override
	        public int compare(Student o1, Student o2) {
	            return o1.getCity().compareTo(o2.getCity());
	        }
	    });
		System.out.println("Students details after sorting with City:");
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i].getId()+" "+st[i].getName()+" "+st[i].getCity());
		}
	
		System.out.println("Enter the id to be searched:");
		int id=scanner.nextInt();
		int i=0;
		for(i=0;i<n;i++)
		{
			if(st[i].getId()==id)
			{
				System.out.println("found");
			}
		}
		if(i==n)
		{
			throw new StudentNotFoundException("id not found");
		}
	}

}
