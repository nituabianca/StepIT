package main;

import java.util.Scanner;

public class Task04
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int f, b, n, feteZilnic, baietiZilnic, total;
	System.out.print("Nr fete: ");
	f=sc.nextInt();
	System.out.print("Nr baieti: ");
	b=sc.nextInt();
	System.out.print("Nr zile: ");
	n=sc.nextInt();
	feteZilnic=3*f;
	baietiZilnic=2*b;
	total=n*(feteZilnic+baietiZilnic);
	System.out.println(total+" pagini");
	

    }

}
