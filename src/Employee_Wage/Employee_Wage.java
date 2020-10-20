package Employee_Wage;
public class Employee_Wage {
	 public static int generateRandomNumber(){
         double x=Math.random();
        int y = (int) Math.round(x);
        return y;
   	 }
	 public static String presenteeCheckForEmployee(int value){
	        if(value==1){
	            return "Employee is Present" ;
	                    
	        }else{
	            return "Employee is Absent" ;
	        }
	    } 
	 
	 
	 public static void main(String args[]) {
       
      System.out.println("Welcome To Employee Wage Calculation Problem");
   // use case 1
      int randomValue = generateRandomNumber();
      String presenteeCheck = presenteeCheckForEmployee(randomValue);
      System.out.println(presenteeCheck);
	}
}
