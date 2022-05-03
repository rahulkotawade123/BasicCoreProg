package EmpWage1_1;

public class uc_3 {

	//add part time employee & wage
	//_assune part time is 8

      public static void main(String[] args) {
      // TODO Auto-generated method stub

    	  int IS_FULL_TIME = 1;
    	  int IS_PART_TIME = 2;
    	  int EMP_WAGE_PER_HOUR = 20;

    	  int emphrs = 0;
    	  int empwage = 0;

    	  double empcheck = Math.floor(Math.random()*10)%3;
    	  
    	  if (empcheck == IS_FULL_TIME)
    	  	 emphrs = 10;

    	   else if  (empcheck == IS_PART_TIME)
    	  	 emphrs = 8;
    	   empwage = emphrs*EMP_WAGE_PER_HOUR;
    	    System.out.println("Emp wage1:"+empwage); 
    	  }

    	  }

