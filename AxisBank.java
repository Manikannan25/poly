package Polymorphism;

public class AxisBank extends Banks {
	
	public int interest(int principalamount)
	{
		return principalamount+(principalamount+15/100);
	}

}
