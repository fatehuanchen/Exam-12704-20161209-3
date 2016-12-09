package Panduan;

import java.util.Scanner;

public class ConfirmDate {

	public static void main(String args[])
	{
		char[] array=new char[20];
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入日期：");
		
		int i = 0;
	    String str=scanner.next();
	   String str1=str.substring(5,7);
	   String str2=str.substring(0,4);
	 
	   //System.out.println(str1);
	   int a=Integer.parseInt(str2);
	   String str3=str.substring(9,10);
	   int b=Integer.parseInt(str3);
	  // System.out.println(a);
	   if((a%4==0&&a%100!=0)||a%400==0)
	   {
		   switch(str1){
		   case "01":
			   i=0;
			   break;
		   case "02":
			   i=31;
			   break;
		   case "03":
			   i=60;
			   break;
		   case "04":
		       i=91;
		       break;
		   case "05":
			   i=121;
			   break;
		   case "06":
			   i=152;
		   case "07":
			   i=182;
			   break;
		   case "08":
			   i=213;
			  break;
		   case "09":
			   i=244;
			   break;
		   case "10":
		   i=274;
		   break;
		   case "11":
			   i=305;
			   break;
		   case "12":
		      i= 335;
		      break;
			 default:
				 break;
			 
			   
			   
		   }
	   }
	   else{
		   switch(str1){
		   case "01":
			   i=0;
			   break;
		   case "02":
			   i=31;
			   break;
		   case "03":
			   i=59;
			   break;
		   case "04":
		       i=90;
		       break;
		   case "05":
			   i=120;
			   break;
		   case "06":
			   i=151;
		   case "07":
			   i=181;
			   break;
		   case "08":
			   i=212;
			  break;
		   case "09":
			   i=243;
			   break;
		   case "10":
		   i=273;
		   break;
		   case "11":
			   i=304;
			   break;
		   case "12":
		      i= 334;
		      break;
		      default:
		    	  break;
	   
	   
	   }
	   }
			 
		
		System.out.println("你输入的日期为当年的第"+(i+b)+"天");
	}
}
