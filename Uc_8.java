package EmpWage1_1;

public class Uc_8 {

	//compute employee wage for multiple companies
    //-Note:Each company has its own wage,number of working days and working hours per month.
	//-Use class method with function parameters instead of class variables.
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	public final String COMPANY_NAME;
	public final int WAGE_PER_HR;
	public final int MAX_WORKING_DAY;
	public final int MAX_WORKING_HRS;
	int totalWage;

	Uc_8(String companyName, int wagePerHr, int maxWorkingDay, int maxWorkingHrs) {
		COMPANY_NAME = companyName;
		WAGE_PER_HR = wagePerHr;
		MAX_WORKING_DAY = maxWorkingDay;
		MAX_WORKING_HRS = maxWorkingHrs;
		int  totalWage=0;
	}
	
	int getEmpType() {
		return (int) (Math.random()*100)%3;
	}
	
	int getWorkingHrs(int empType) {
		switch (empType) {	
		case IS_PART_TIME:
			return 4;
		case IS_FULL_TIME:
			return 8;
		default:
			return 0;
		}
	}
	
	void calculateTotalWage() {
		int workingHrs;
	//int day = 0;
	//while ( day <= MAX_WORKING_DAY && getWorkingHrs(0) < MAX_WORKING_HRS)
	//int MAX_WORKING_DAYS = 0;
	for (int day = 1, totalWorkingHrs=0; day<=MAX_WORKING_DAY 
			&& totalWorkingHrs <= MAX_WORKING_HRS; day++,
			totalWorkingHrs +=workingHrs)
	{
		int empType = getEmpType();
		workingHrs = getWorkingHrs(empType);
		int wage = workingHrs*WAGE_PER_HR;
		totalWage += wage;
	}
}
    public String toString() {
    	System.out.println("Details of: "+ COMPANY_NAME +" "+"employee");
    	System.out.println("Wage per hours:"+ WAGE_PER_HR);
		System.out.println("maximum working days:" + MAX_WORKING_DAY);
    	System.out.println("maximun working hours:" + MAX_WORKING_HRS);
    return "Total wage for a month of "+ COMPANY_NAME + "employee is:"+" "+ totalWage + "\n";
}
		public static void main(String[] args) {
			
		Uc_8 Dmart = new Uc_8("Dmart",100,25,80);
		Uc_8 SMart = new Uc_8("SMart",150,20,100);
		
		Dmart.calculateTotalWage();
		System.out.println(Dmart);
		
		SMart.calculateTotalWage();
		System.out.println(SMart);
   }	
}
