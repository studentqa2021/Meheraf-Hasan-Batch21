package com.practic_inheritance;

public class Animal  {
	
	
	public void getArray(int [] a) {
		//System.out.println("This is Total Array="+Arrays.toString(a));
		//System.out.println("This is Total Array=="+a.length);
		//System.out.println("This is position of Array=="+ a[5]);
		
		for (int i =0; i<a.length;i++) {
			for (int j=(i+1); j<a.length;j++) { 
				if (a[i]==a[j]) {
					System.out.println("Found my duplicate");
					System.out.println(a[i]+"*****"+a[j]);
				}
			}
		}				
	}
}

	
		
	//public void getArrayIndivisual (int[] b) {
	
		
		//System.out.println("This is Indivisual Array="+b[5] );
		
	
 // public void getArrayTotal () {
	  
	  
	  //int [] total = {1,2,3,4,5,6,7,8,9,10};
	  //System.out.println("This is Total Number Array="+total.length);
	   
	  
  

