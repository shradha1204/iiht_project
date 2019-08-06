package com.abcde;
import com.abcdef.*;
public class TDemo2{
	
	public TDemo2()
	{
		System.out.println("TDemo2() constructor");
	}
	
	public void met2() throws Exception,NullPointerException
	{

		TDemo1 td = new TDemo1();
		System.out.println("in met2(), b4 met1()");
		td.met1();
	}
}