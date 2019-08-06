package com.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLinkedListEg {
public static void main(String[] args) {
	class Student {	
		String name;	
		int age;	
		@Override	
		public String toString() {	
			return "Student [name=" + name + ", age=" + age + "]";	
			}	
		
		public Student(String name, int age) 
		{		
			super();	
			this.name = name;
			this.age = age;	
			}	
		
		public String getName()
		{		return name;	}	
		public void setName(String name) {		
			this.name = name;	
			}	
		public int getAge() {		
			return age;	
			}	
		public void setAge(int age) {	
			this.age = age;	
			}
		}
	
	ArrayList<LinkedList<Student>> li=new ArrayList<LinkedList<Student>>();	
	LinkedList<Student> lii=new LinkedList<Student>();	
	lii.add(new Student("aksah",12));	
	lii.add(new Student("taru",25));	
	LinkedList<Student> lii2=new LinkedList<Student>();	
	lii2.add(new Student("subham",14));		
	lii2.add(new Student("kulli",54));		
	li.add(lii);		
	li.add(lii2);		
	System.out.println(li);			
	Iterator<LinkedList<Student>> ii=li.iterator();		
	while(ii.hasNext())		
	{			
		LinkedList<Student> linkedlist=ii.next();	
		Iterator<Student> ii2=linkedlist.iterator();	
		while(ii2.hasNext())		
		{				
			System.out.println(ii2.next());		
			}		
		}	
	}
}