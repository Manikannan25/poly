package Polymorphism;

public class Bank {
	public int loan()
	{
		return 50000;
		
	}
	public int loan(int salary)
	{
		return (salary*10)+50000;
	}
	public int loan(int salary,int land)
	{
		return 50000+(salary*10)+(land/2);
	}

}
