package com.sapient.problem1;

public class ProblemRunner {

	static void operations(Int_Arr_Process runner)
	{
		System.out.println("The array is: ");
		runner.display();
		runner.sortArray();
		System.out.println("The sorted array is: ");
		runner.display();
		System.out.println("The biggest number is "+runner.biggestElement());
		System.out.println("The smallest number is "+runner.smallestElement()+"\n");
	}
	
	public static void main(String[] args) {
		
		int size=5;
		Int_Arr_Process runner1=new Int_Arr_Process(size);
		runner1.readArray();
		operations(runner1);
		
		Int_Arr_Process runner2=new Int_Arr_Process();
		runner2.readArray();
		operations(runner2);
		
		
		int[] array= {101,102,203,50,60,23};
		Int_Arr_Process runner3=new Int_Arr_Process(array);
		operations(runner3);
		
		
		int[] array1 = {210,908,165,142,100,123};
		Int_Arr_Process copyobject=new Int_Arr_Process(array1);
		Int_Arr_Process runner4=new Int_Arr_Process(copyobject);
		operations(runner4);
		
	}

}
