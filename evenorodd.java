/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner s=new Scanner(System.in);
	 int n1,n2,add;
	 n1=s.nextInt();
	 n2=s.nextInt();
	 add=n1+n2;
	 if(add%2==0)
	 {
	 	System.out.println("even");
	 }
	 else
	 System.out.println("odd");
	}
}