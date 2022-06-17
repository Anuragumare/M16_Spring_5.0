package com.tns.di1;

public class AnotherStudent 
{
	//dependency in terms of objects
		MathCheat m1;
		
		
		//using setters
		public void setM1(MathCheat m1) {
			this.m1 = m1;
		}



		public void startcheating()
		{
			m1.mathcheat();
		}

}
