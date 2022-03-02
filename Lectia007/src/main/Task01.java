package main;

import java.util.Scanner;

public class Task01
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int x, y, n;
	x=sc.nextInt();
	y=sc.nextInt();
	//5 l/sticla, 8 l/vas -> 2 sticle deschise
	n=(int)y/x; //sticle intregi folosite
	if(y%x!=0)
	{
	    n=n+1;
	}
	System.out.println(n);
    }

}
