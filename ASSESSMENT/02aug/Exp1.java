import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,i,q;
		System.out.println("Enter the no. of element you want to enter in the Array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr=new int[n];
		for(i=0;i<n;i++)
		{
			q=sc.nextInt();
			arr[i]=q;
		}
		System.out.println("Original Array--> ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.println("Array after Reverse--> ");
		int temp;
		int start=0,end;
		end=n-1;
        
        while (start < end) 
        { 
            temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }
        for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}

		
	}

}