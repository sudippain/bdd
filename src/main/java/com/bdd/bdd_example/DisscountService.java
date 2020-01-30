package com.bdd.bdd_example;

/**
 * Hello world!
 *
 */
public class DisscountService 
{
   public String getDiscount(int amount) {
	  
	   String disscountPercentage="";
	   if(amount > 5000 && amount<10000) {
		   disscountPercentage="10%";
	
	   }
	   else if( amount>=10000) {
		   disscountPercentage="15%";
	
	   }
	   else {
		   disscountPercentage="NA";
	   }
	   return disscountPercentage;
	   
   }
}
