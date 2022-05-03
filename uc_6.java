package EmpWage1_1;

public class uc_6 {

	//calculate wage till a condition of total working hours or days is reached for a month
	//_assume 100 hours and 20 days
	public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int MONTH_OF_WORKING_DAYS = 20;
    public static final int WOR_HRS_IN_MONTH = 100;

    public static void main(String[] args, String empwage) {
		// TODO Auto-generated method stub

	    int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		while (totalEmpHrs <= WOR_HRS_IN_MONTH && totalWorkingDays < MONTH_OF_WORKING_DAYS) {
	    	 totalWorkingDays++; 
	     }
	     int empcheck = 0;
		switch (empcheck) {
	         case 1: IS_FULL_TIME :
	    	 break;
	    	 case 2: IS_PART_TIME :
	    	 break;
	    	 default:
	     }
	     
		System.out.println("Emp wage:"+empwage);
	}

}

