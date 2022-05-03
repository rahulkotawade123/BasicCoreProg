package EmpWage1_1;

public class uc_2 {

	//calculate employee wage 
		//_Assume wage per hour is 20
		//_Assume full day hour is 8
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		     int IS_FULL_TIME = 1;
		     int EMP_WAGE_PER_HOUR = 20;
		    
		     int emphrs = 0;
		     int empwage = 0;
		   
		     double empcheck = Math.floor(Math.random()*10)%2;
		     
		     if (empcheck == IS_FULL_TIME)
		    	 emphrs = 8;
		     else
		    	 emphrs = 0;
		     empwage = emphrs*EMP_WAGE_PER_HOUR;
	           System.out.println("Emp wage:"+empwage); 
		}

	}


