package main;

import java.util.Scanner;

public class Task03
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int n;
	String semn;
	n=sc.nextInt();
	if(n>0)
	{
	    semn="pozitiv";
	}
	else
	{
		if(n<0)
		{
		    semn="negativ";
		}
		else
		{
		    semn="nul";
		}
	}
	System.out.println(semn);

    }

}
