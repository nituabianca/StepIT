package main;

import java.util.Scanner;

public class Task07
{

    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int cod, copieCod, an, luna, zi;
	String anString, lunaString, ziString;
	System.out.print("AALLZZ: ");
	cod=sc.nextInt();
	copieCod=cod;
	zi=copieCod%100;
	copieCod=copieCod/100;
	luna=copieCod%100;
	copieCod=copieCod/100;
	an=copieCod%100;
	anString=""+an;
	lunaString=""+luna;
	ziString=""+zi;
	if(an<10)
	{
	    anString="0"+an;
	}
	if(luna<10)
	{
	    lunaString="0"+luna;
	}
	if(zi<10)
	{
	    ziString="0"+zi;
	}
	System.out.println(anString+" "+lunaString+" "+ziString);

    }

}
