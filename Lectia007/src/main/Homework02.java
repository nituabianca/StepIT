package main;

import java.util.Scanner;

public class Homework02
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int n, radacina;
	String mesaj;
	n=sc.nextInt();
	if( (int) Math.sqrt(n)== Math.sqrt(n))
	{
	    mesaj="da";
	}
	else
	{
	    mesaj="nu";
	}
	System.out.println(mesaj);	
    }

}
