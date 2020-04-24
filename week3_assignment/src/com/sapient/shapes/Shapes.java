package com.sapient.shapes;

public class Shapes {

	int numberOfSides;
	void calculateShapeArea(int numberOfSides, int side_length)
	{
		if(numberOfSides==1)
		{
			Circle circle=new Circle();
			System.out.println("The Area of the Circle is "+circle.calculateArea(side_length));
		}
		else if(numberOfSides==3)
		{
			Triangle triangle=new Triangle();
			System.out.println("The Area of the Triangle is "+triangle.calculateArea(side_length));
		}
		else if(numberOfSides==4)
		{
			Square square=new Square();
			System.out.println("The Area of the Square is "+square.calculateArea(side_length));
		}
		else
		{
			System.out.println("No Shapes Present");
		}
	}
	
	public static void main(String[] args) {
		Shapes shapes=new Shapes();
		shapes.calculateShapeArea(3, 12);
		shapes.calculateShapeArea(4, 15);
		shapes.calculateShapeArea(5, 15);
	}
}
