package com.example.copyMe;

public class Demo {

	public static void main(String[] args) {
		int num = 234; 
		
		int digit = Integer.toString(num).length();
		System.out.println("dgits = " + digit);
		
		
		for(int i=1;i<digit;i++)
		{
			int radix = (int)Math.pow(10, i);
			if(i==digit-1)
			{
				System.out.println("current number is : " + (num/radix)%10);
			}else
			{
				System.out.println("current number is : " + (num/radix)%10*(-1));
			}
		}
		int radix = (int)Math.pow(10, digit-1);
		System.out.println("radix = " + radix);
		System.out.println((num/radix)%10);
	}

}