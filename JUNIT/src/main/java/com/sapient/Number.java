package com.sapient;

public class Number {

	public int check_prime(int num) throws InvalidNumberException
	{
		if(num<2)
		{
			throw new InvalidNumberException("Number needs to be greater than 1");
		}
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public int check_amstrong_number(int num) throws InvalidNumberException
	{
		if(num<0) {
			throw new InvalidNumberException("Number must be a non-negative integer");
		}
		int temp1=num,temp2=num,sum=0,num_of_digits=0;
		while(temp1>0)
		{
			num_of_digits++;
			temp1=temp1/10;
		}
		while(temp2>0)
		{
			sum+=Math.pow(temp2%10, num_of_digits);
			temp2=temp2/10;
		}
		if(sum==num) return 1;
		return 0;
	}
	
	public int check_palindrome(int num) throws InvalidNumberException{
		if(num<0) throw new InvalidNumberException("Number cant be less than 0");
		int temp1=num,temp2=0;
		while(temp1>0){
			temp2=temp2*10+temp1%10;
			temp1=temp1/10;
		}
		if(temp2==num)
		{
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) throws InvalidNumberException {
		Number number=new Number();
		
		//System.out.println(number.check_prime(-1));
		System.out.println(number.check_palindrome(151));
		System.out.println(number.check_palindrome(-90));

	}

}
