package MainPackage;

//By Jama Yusuf

public class MyInteger {


	public static void main(String[] args) {
		
	}
	
	// attribute
	private int value;
	
	//getter for 'value'
	public int getValue() 
	{
		return value;
	}
	
	//setter for 'value'
	public void setValue(int Value) 
	{
		this.value = Value;
	}

	//constructor
	public MyInteger(int Value)
	{
		this.value = Value;
	}
	//method isEven. returns true if the value is an even number
	public boolean isEven() 
	{
		return (this.value % 2) == 0;
	}
	
	//method isOdd. returns true if the value is an odd number.
	public boolean isOdd()
	{
		return isOdd(value);
	}
	
	//method isPrime. returns true if the value is a prime number.
	public boolean isPrime()
	{
		return isPrime(value);
	}
	
	//static method isEven(). takes a value and returns true if it is an even number.
	public static boolean isEven(int value1)
	{
		return (value1 % 2) == 0;
	}
	
	//static method isOdd(int). takes a value and returns true if it is an odd number
	public static boolean isOdd (int value1)
	{
		return (value1 % 2) == 1;
	
	}
	//static method isPrime(int). takes a value and returns true if it is a prime number
	public static boolean isPrime (int value1)
	{
		for(int v = 2; v < value1; v++) {
			if(value1 % v == 0) {
				return false;
	}
	}
		return true;
}
	// static method isEven(MyInteger). takes a value and returns true if it is an even number
		public static boolean isEven (MyInteger value1)
		{
			return (value1.value % 2 == 0);
			
		}
		
	// static method isOdd(MyInteger). takes a value and returns true if it is an odd number
		public static boolean isOdd (MyInteger value1)
		{
			return (value1.value % 2 == 1);
		}
	
	// static method isPrime(MyInteger). takes a value and returns true if it is an prime number
		public static boolean isPrime (MyInteger value1)
		{
			for(int v = 2; v < value1.value; v++) {
				if(value1.value % v == 0) {
					return false;
		}
			}
			return true;
		}
	//method equals(int). Returns true if the value in the object is equal to the value.
		public boolean equals(int value1)
		{
			return value == value1;
		}
	//method equals(MyInteger). Returns true if the value in the object is equal to the value
		public boolean equals(MyInteger MyInteger)
		{
			return equals(MyInteger.getValue());
		}
		
	//a static method called parseInt(char[]) that converts an array of numeric characters into an int value
		public static int parseInt(char[] string)
		{
			return parseInt(new String(string));
		}
	
	//a static method called parseInt(String) that converts a string into an int value.
		public static int parseInt(String string)
		{
			return Integer.parseInt(string);
		}
		
		
		
	
		
		{			
		
		}

			
		
	
			
}		
	



