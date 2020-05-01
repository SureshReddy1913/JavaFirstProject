package com.sapient.problem2;

public class ProblemRunner {
	
	public static void main(String[] args) {
		
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		Matrix mat=new Matrix();
		
		mat.readMatrix();
		mat.display();
		System.out.println("\nMatrix to be added:");
		mat.display(arr);
		arr=mat.addMatrices(arr);
		System.out.println("\nSum:");
		mat.display(arr);
		if(mat.checkScalarMatrix())
			System.out.println("\nMatrix is scalar");
		else 
			System.out.println("\nMatrix is not scalar");
		
		System.out.println("\nMatrix to be multiplied:");
		mat.display(arr);
		arr=mat.multiplyMatrix(arr);
		System.out.println("\nProduct:");
		mat.display(arr);
		
	}

}
