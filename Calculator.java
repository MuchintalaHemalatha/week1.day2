package week1.day2;

public class Calculator {

	
		public int add(int num1,int num2,int num3)
		{
			int add=num1+num2+num3;
			return add;
		}
		public int sub(int num1,int num2)
		{
			int sub=num1-num2;
			return sub;
		}
		public double mul(double num1,double num2)
		{
			double mul=num1*num2;
			return mul;
		}
		public float divide(float num1,float num2)
		{
			float divide=num1/num2;
			return divide;
		}



		public static void main(String[] args) {

			Calculator calc=new Calculator();
			System.out.println("Addition is:"+calc.add(2, 3, 5));
			System.out.println("Subtraction is:"+calc.sub(5, 2));
			System.out.println("Multiplication is:"+calc.mul(20, 30));
			System.out.println("Division is:"+calc.divide(10.10f, 5.5f));
		}

	

	}


