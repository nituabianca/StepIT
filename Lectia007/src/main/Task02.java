//cate cifre impare are nr abc?
package main;

import java.util.Scanner;

public class Task02
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int nr, cnr, cifra, cate;
	nr=sc.nextInt();
	cnr=nr;//copie
	cate=0;
	cifra=cnr%10;
	if(cifra%2==1)
	{
	    cate=cate+1;
	}
	cnr=cnr/10;//nr ramane de 2 cifre -> ab
	cifra=cnr%10;//afiseaza b ul din ab
	if(cifra%2==1)
	{
	    cate=cate+1;
	}
	cnr=cnr/10;
	cifra=cnr%10;
	if(cifra%2==1)
	{
	    cate=cate+1;
	}
	cnr=cnr/10;
	System.out.println(cate);
	
	
	
	
	
	
//	c=cnr%10;
//	a=cnr/100;
//	b=cnr/10-a*10;
	
	
	
	
	
//	int n, a, b, c;
//	int nrImpare=0;
//	n=sc.nextInt();
//	a=n/100;
//	c=n%10;
//	b=(n%100-c)/10;
	
	//ABC  ABc  AbC Abc aBC aBc abC  abC 
//	if(a%2==1)
//	{
//	    if(b%2==1)
//	    {
//		if(c%2==1) //ABC
//		{
//		    nrImpare=3;
//		}
//		else       //ABc
//		{
//		    nrImpare=2;
//		}
//	    }
//	    else		
//	    {
//		if(c%2==1)  //AbC
//		{
//		    nrImpare=2;
//		}
//		else
//		{
//		    nrImpare=1;  //Abc
//		}
//	    }
//	}
//	else 
//	{
//	    if(b%2==1)
//	    {
//		if(c%2==1)  //aBC
//		{
//		    nrImpare=2;
//		}
//		else
//		{
//		    nrImpare=1; //aBc
//		}
//	    }
//	    else
//	    {
//		nrImpare=1;
//	    }
//	}
//	System.out.println(nrImpare);
    }

}
