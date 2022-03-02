package main;

import java.util.Scanner;

public class Task05
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int n;
	long nrPasari;
	n=sc.nextInt();
	nrPasari=(long) (n*n*n*n*n);
	System.out.println(nrPasari + " pasari");
    }

}
