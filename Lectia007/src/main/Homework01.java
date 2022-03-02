package main;

import java.util.Scanner;

public class Homework01
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	double v, viteza;
	int d, t;
	v=sc.nextDouble();
	d=sc.nextInt();
	viteza=(1000/60)*v;
	t= (int) (d/viteza);
	System.out.println(t);
    }

}
