package Employee_Wage;
public class Employee_Wage {
	 public static int generateRandomNumber(){
         double x=Math.random();
        int y = (int) Math.round(x);
        return y;
   	 }
	 //UC1
	 public static String presenteeCheckForEmployee(int value){
	        if(value==1){
	            return "Employee is Present" ;
	                    
	        }else{
	            return "Employee is Absent" ;
	        }
	    } 
	//use case 2
     public static int calculateEmpDailyWage( int wagePerHour, int workingHrs ){
    	 
        return ( wagePerHour * workingHrs );
    }
	 
   //use case 3
     public static String calculateWageCalculationForPartTimeEmps (){
        
        int random = generateRandomNumber();
        int wagePerHour = 20;
        int partTimeEmpWage = 0;
        if(random ==1 ){
            partTimeEmpWage = (random+8) * 20 * wagePerHour;//20 being the number of days in a month
            return "Employee is a Part Time Employee and the wage is :"+partTimeEmpWage;
        }else{
            return "Employee is not a Part Time Employee ";
        }
    }
	 public static void main(String args[]) {
       
      System.out.println("Welcome To Employee Wage Calculation Problem");
   // use case 1
      int randomValue = generateRandomNumber();
      String presenteeCheck = presenteeCheckForEmployee(randomValue);
      System.out.println(presenteeCheck);
      if(randomValue==1)
      {
    //use case 2
	int empDailyWage = calculateEmpDailyWage(20,8);

      System.out.println("Employees Daily Wage : "+empDailyWage);
      //use case 3
      String wageForPartTimeEmp = calculateWageCalculationForPartTimeEmps();
      System.out.println("Employees Part Time Wage : "+wageForPartTimeEmp);

      }
	}
}
