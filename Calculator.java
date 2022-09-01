package Polymorphism;

public class Calculator {
	public int add(int num1,int num2)
	{
		return num1+num2;
		
	}
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	public int add(int num1,int num2,int num3,int num4)
	{
		return num1+num2+num3+num4;
	}
	public String add(String word1,String word2)
	{
	return word1.concat(word2);	
	}

}
