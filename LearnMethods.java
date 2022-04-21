package Week1.Day2;

public class LearnMethods {
	public static void main(String[] args)
	{
		LearnMethods LM = new LearnMethods();
		LM.carName();
		int RegNo = LM.getCarRegNo(); 
		System.out.println(RegNo);
		String Variant = LM.getCarVariant();
		System.out.println(Variant);
		int Multiply = LM.multiplyTwoNo(4,4);
		System.out.println(Multiply);
	}
	public void carName()
	{
		System.out.println("Honda City");
	}
	public int getCarRegNo()
	{
		int CarRegNo= 4455;
	    return CarRegNo;
	}
		
	public String getCarVariant()
	{
		return "Petrol";
	}
	public int multiplyTwoNo(int a, int b)
	{
		return a*b;
	}
}
