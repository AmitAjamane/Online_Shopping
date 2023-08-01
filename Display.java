package abc;

import java.util.Scanner;

public class Display 
{
  public static void main(String[] args) 
	{ 
		Scanner obj = new Scanner (System.in);
		int chh,c=0,b=0;
		int a=0,d=0,f=0,e=0,p=0;
		System.out.println("!!!!  welcom  !!!!  ");
		
		System.out.println("\n Product name\n press 1 for sugar\n press 2 for rice\n press 3 for santur sope\n press 4 for Lux sope ");
		System.out.println(" Enter  how many product you want");
		p=obj.nextInt();
	for(int q=0;q<p;q++) {
		System.out.println(" \nEnter your choise");
		chh=obj.nextInt();
		switch (chh)
		{
		case 1 :
		
			//int a;
			System.out.println(" !! Sugar !!");
	        System.out.println(" The price of sugar is 36 rs per kg & 40 rs per kg\n enter which do you want 36 OR 40");
			a=obj.nextInt();
			if (a==36)
			{  
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=a*b;
				System.out.println(" total price of your Product "+c);
			}
			else if (a==40)
			{  
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=a*b;
				System.out.println(" total price of your Product "+c);
			}
			else 
			{
				System.out.println(" this is not Available\n!! THANKY YOU !! ");
			}
			break;
		
		case 2:
		
			//int d;
			System.out.println(" !! Rice !!");
	        System.out.println(" The price of Rise is 40 rs per kg & 50 rs per kg\n enter which do you want 40 OR 50");
			d=obj.nextInt();
			if (d==40)
			{ 
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=d*b;
				System.out.println(" total price of your Product "+c);
			}
			else if(d==50)
			{  
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=d*b;
				System.out.println(" total price of your Product "+c);
			}
			else 
			{
				System.out.println(" this is not Available\n!! THANKY YOU !! ");
			}
			break;
		
		case 3:
		
			//int e;
			System.out.println(" !! Santur sope !!");
	        System.out.println(" The price of santur sope is 10 rs per or 20 rs per\n enter which do you want 10 OR 20");
			e=obj.nextInt();
			if (e==10)
			{ 
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=e*b;
				System.out.println(" total price of your Product "+c);
			}
			
			else if (e==20)
			{  
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=e*b;
				System.out.println(" total price of your Product "+c);
			}
			else 
			{
				System.out.println(" this is not Available\n!! THANKY YOU !! ");
			}
			break;
		
		case 4:
		
			//int f;
			System.out.println(" !! LUX sope !!");
			System.out.println(" The price of lux sope  is 25 rs per & 30 rs per \n enter which do you want 40 OR 50");
			f=obj.nextInt();
			if (f==25)
			{  
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=f*b;
				System.out.println(" total price of your Product "+c);
			}
			else if (f==30)
			{  
				System.out.println(" Enter the quantity");
				b=obj.nextInt();
				c=f*b;
				System.out.println(" total price of your Product "+c);
			}
			else 
			{
				System.out.println(" this is not Available\n!! THANKY YOU !! ");
			}
		
			break;
			
			default :
			{
				System.out.println(" Invalid coise\n thank you !!!!!!");
			}
			break;
		}
		
		if ( chh==1 || chh==2 || chh==3 || chh==4) {
			  if ((a==36 ||a==40)||(d==40 ||d==50)||(e==10||e==20)||(f==25||f==30))
			    {
			int tot;
			if (chh==1) {System.out.println("\n Your product is: suger");}
			if (chh==2) {System.out.println("\n Your product is: Rice");}
			if (chh==3) {System.out.println("\n Your product is: santur sope");}
			if (chh==4) {System.out.println("\n Your product is: LUX sope");}
			
		    //if ((a==36 ||a==40)||(d==40 ||d==50)||(e==10||e==20)||(f==25||f==30))
		    {
			System.out.println(" Quantity is : "+b+" unit");
			
            System.out.println("\n special disscount is 10 % on your shoppping ");
			tot=c-(c/10);
		    System.out.println(" After giving disscount \n You have to pay is : "+tot+" rs");
			}
		}
	}
	}
	}
}
			





