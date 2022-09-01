package Polymorphism;

public class ActionMovie extends Movie {
	public String movieReview(String name,int noOfFights)
	{
		if(noOfFights>3&&noOfFights<5)
		{
			return "Good movie";
		}
		else if(noOfFights<3)
		{
			return "Average Movie";
		}
		else 
		{
			return "Okay";
		}
	}

}
