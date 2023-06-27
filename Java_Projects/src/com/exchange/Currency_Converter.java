package com.exchange;
import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Currency_Converter 
{
public static void main(String[] args) 
{
double rupee,doller,pound,code,euro,KWD;
DecimalFormat f= new DecimalFormat("##.###");
Scanner sc=new Scanner(System.in);
System.out.println("** Welcome to Currency project***\nEnter the currency code\n1:Rupees\n2:Doller\n3:Pound\n4:Euro\n5:KWD");
code=sc.nextInt();
if(code==1)
{
	System.out.println("Enter amount in rupees");
	rupee =sc.nextDouble();
	doller=rupee/82.52;
	System.out.println("Doller: "+f.format(doller));
	pound=rupee/99.55;
	System.out.println("Pound:"+f.format(pound));
	euro = rupee/88.28;
	System.out.println("Euro:"+f.format(euro));
	KWD= rupee/270.54;
	System.out.println("Kuwaiti dinar:"+f.format(KWD));
}
	else if(code==2)
	{
		System.out.println("Enter amount in doller:");
		doller=sc.nextDouble();
		rupee =doller*82.52;
		System.out.println("Rupees:"+f.format(rupee));
		pound = doller*0.83;
		System.out.println("Pound:"+f.format(pound));
		euro=doller*0.96;
		System.out.println("Euro:"+f.format(euro));
		KWD= doller*0.31;
		System.out.println("Kuwaiti dinar:"+f.format(KWD));
	}
		else if(code==3)
		{
			System.out.println("Enter amount in pound:");
			pound=sc.nextDouble();
			rupee=pound*99.48;
			System.out.println("Rupees:"+f.format(rupee));
			doller=pound*1.22;
			System.out.println("Doller:"+f.format(doller));
			euro=pound*1.17;
			System.out.println("Euro:"+f.format(euro));
			KWD =pound*0.3748;
			System.out.println("Kuwaiti dinar:"+f.format(KWD));
		}
		else if(code ==4)
		{
			System.out.println("Enter amount in Euro:");
			euro=sc.nextDouble();
			rupee =euro*88.28;
			System.out.println("Rupees:"+f.format(rupee));
			doller=euro*1.07;
			System.out.println("Doller:"+f.format(doller));
			pound=euro*0.89;
			System.out.println("Pound:"+f.format(pound));
			KWD=euro*0.33;
			System.out.println("Kuwaiti dianar:"+f.format(KWD));
		}
		else if(code==5)
		{
			System.out.println("Enter amount in Kuwaiti dinar:");
			KWD=sc.nextDouble();
			rupee=KWD*270.54;
			System.out.println("Rupees:"+f.format(rupee));
			doller=KWD*3.28;
			System.out.println("Doller:"+f.format(doller));
			pound=KWD*2.72;
			System.out.println("Pound:"+f.format(pound));
			euro=KWD*3.13;
			System.out.println("Euro:"+f.format(euro));
			
		}
		else
			System.out.println("Invalid code:");
	}
}


