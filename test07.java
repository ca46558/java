package tw.index;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		int year = 2023;
		  
	//  System.out.printf("%d 年是潤年",year);
	  
	//
	//  if ( year%400==0 || (year%4==0 && year%100 !=0) ) {
	//   
	//   isLeap = true;
	//   
	//  }else{
	  
	//   isLeap = false;
	//   
	//  }
	  
	  
	//---------------------------------------------------------------  
	  boolean  isLeap;
	  
	  if(year % 4 == 0) {
	   if(year%100 ==0) {
	    if(year %400 ==0) {
	     
	     isLeap = true;
	    }else {
	     isLeap = false;
	   }
	   }else {
	    
	    isLeap = true;
	    }
	  }else {
	   isLeap = false;
	  }
	  
	  System.out.printf("%d年是%s年",year,isLeap?"問":"平");
	 }

	}