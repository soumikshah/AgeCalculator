package shah.soumik;

import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
    int a,b = 0,c,d;
    System.out.println("Enter the age of the person");
    Scanner sc=new Scanner(System.in);
    int v=sc.nextInt();
    if (v<4)
    {
	System.out.println("This is the age of infant");
    }
    else if(v>=4 && v<10)
    {
    	System.out.println("This is toddler ");
    }
    else if(v>=10 && v<12)
    {
    	System.out.println("This is kid");
    }
    else if(v>=12 && v<18)
    {
    	System.out.println("This is teenager");
    }
    else if(v>=18 && v<60)
    {
    	System.out.println("This is the adult");
    	
    }
    else if(v>=60)
    {
    	System.out.println("This is the age of senior citizen");
    }
  }
}
