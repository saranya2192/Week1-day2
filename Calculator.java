package Week1.Day2;

public class Calculator {
public static void main(String[] args) {
	Calculator CA= new Calculator();
	CA.MyCalculator();
	int Add=CA.addThreeNumbers(3,5,3);
	System.out.println(Add);
	int Sub=CA.subTwoNumbers(5,3);
	System.out.println(Sub);
	double Multiply=CA.multiplyTwoNumbers(8,7);
	System.out.println(Multiply);
	float Divide=CA.divideTwoNumbers(6,3);
	System.out.println(Divide);
}
public void MyCalculator() {
}
	
public int addThreeNumbers(int a, int b, int c)
{
return a+b;
}
public int subTwoNumbers(int a, int b)
{
	return a-b;
}
public double multiplyTwoNumbers(double a, double b)
{
	return a*b;
}
public float divideTwoNumbers(float a, float b)
{
return a/b;
}
}


