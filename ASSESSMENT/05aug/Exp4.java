package com.abcdefg;
import com.abcde.*;

public class TDemo3 {
	public static void main(String args[]) //throws Exception
	{
		try{
		TDemo2 td2 = new TDemo2();
		System.out.println("in main, b4 met2()");
		td2.met2();		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception occurred"+e.getMessage());
		}
	}
}


/*Output

TDemo2() constructor
in main, b4 met2()
TDemo1() constructor
in met2(), b4 met1()
java.lang.Exception: Some Exception
	at com.abcdef.TDemo1.met1(TDemo1.java:13)
	at com.abcde.TDemo2.met2(TDemo2.java:15)
	at com.abcdefg.ThrowsDemo.main(ThrowsDemo.java:10)
Exception occurredSome Exception*/