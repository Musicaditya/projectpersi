package com.psl.main;
/**
 * 
 * Here the program consists of five functions in total
 * isEven
 * @author aditya_vyas
 * @version luna
 * 
 *
 */

public class ControlFlow {
	
	public static boolean isEven(int n) {
		
		if(n%2 == 0)
			return true;
					
			else 
				return false;
	}
	
	public static double Calculate(int x ,int n){
		double val = 1;
		
		if(n>0){
			
		for(int i = 1; i <= n; i++){
			val = val*x;
		}
		}
		else {
			for(int i = n ; i < 0 ; i++)
				val =  val/x;
			
		
		}
		return val;
	}
	
	
	
	public static boolean isLeap(int year) {
		
		boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            return flag;
        }
        else
        {
           return flag;
        }
    }
		
	


	public static boolean Datevalidate(String date) {
		
		String[] d = date.split("/"); 
		
		int dd = Integer.parseInt(d[0]);
		int mm = Integer.parseInt(d[1]);
		int yy = Integer.parseInt(d[2]);
		
		int[] leap = {31,29,31,30,31,30,31,31,30,31,30,31};
		int[] nleap = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		if(isLeap(yy)) {
			if(mm > 0 && mm < 13){
				if(dd>0 && dd< leap[mm-1])
					return true;
				else
					return false;
			}
			return false;
			
		}
		else 
			if(mm > 0 && mm < 13){
				if(dd>0 && dd< nleap[mm-1])
					return true;
				else
					return false;
			}
			return false;
			
			
		
		
	}


public static void main(String[] args) {
		
	
	System.out.println(isEven(3));
	System.out.println(Calculate(5,-2
			));
	System.out.println(isLeap(2000) );
	System.out.println(Datevalidate("31/06/2018"));
}
}