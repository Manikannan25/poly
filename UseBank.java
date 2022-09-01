package Polymorphism;

public class UseBank {
	public static void main(String args[])
	{
		Bank bk=new Bank();
		System.out.println(bk.loan(100000));
		System.out.println(bk.loan(100000,2000000));
		System.out.println(bk.loan());
	}

}
