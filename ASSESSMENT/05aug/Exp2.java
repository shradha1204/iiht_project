package com.abcdef;
public class TDemo1{
	public TDemo1()
	{
		System.out.println("TDemo1() constructor");
	}
	
	public void met1() throws Exception
	{
		int x = 1;
		if(x==1)
		{
			throw new Exception("Some Exception");
		}
	}
}