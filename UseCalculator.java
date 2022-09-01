package Polymorphism;

public class UseCalculator {
	public static void main(String args[])
	{
		Calculator cl=new Calculator();
		System.out.println(cl.add(10,20));
		System.out.println(cl.add(10,20,30));
		System.out.println(cl.add(10,20,30,40));
		System.out.println(cl.add("mani","kannan"));
	}

}
