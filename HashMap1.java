package com;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap1 set=new  HashMap1();   
		 set.Details();      
		 }       
	public void Details() { 
		  Scanner sc = new Scanner(System.in);
		     System.out.println("customercode, name, email, phone, customertype, dob, countryofoperation, basecurrency, bankacctno, bankbranch, bankname" );
		     String str,df,sd;
          str =sc.nextLine();
          String[] arr = str.split(",");
        
        
          System.out.println(Arrays.toString(arr));
          System.out.println(arr.length);
        
	   if (arr.length!=11) {
	          System.out.println("only 10 namber");
	          Details();
	   }
	          else {
	        	  System.out.println("name, email, phone, customertype, dob");
       }
	   df = sc.nextLine();
       String[] val = df.split(",");
	    
		ArrayList<String> list = new ArrayList<String>();
		list.add(df);
				
		if( val.length!=5) {
	       System.out.println("the length 7 namber ");
	       Details();
		}	
		else  {
			System.out.println("name, email, phone, customertype, dob");
		}
		sd = sc.nextLine();
	       String[] va = sd.split(",");
		    
			ArrayList<String> list1 = new ArrayList<String>();
			list.add(sd);
			
			if( va.length!=5) {
		       System.out.println("the length ");
		       Details();
			}	
			else  {
				System.out.println("lest     1");
			}
			 
			 HashMap<String, String> Adss = new HashMap<String, String>();
                Adss.put(sd, df);
               System.out.println(Adss);
	
}
}
