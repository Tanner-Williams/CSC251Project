import java.io.File;    // Allows access to files
import java.util.Scanner;     //Scanner import for user input

class Demo{
   public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(file);
    
  }
}

class Policy {
      /**
      The bmiCalculatorMethod displays the sum of the formula used with the given data below.
      @param weight weight of the policy holder
      @param height height of the policy holder
      */
   static void bmiCalculatorMethod(double weight, double height) {    //Method to calculate users BMI
      System.out.println((weight * 703) / (height * height));
  }

   public static void main(String[] args) {
   Scanner userInputScanner = new Scanner(System.in);    // universal user input scanner
         /**
         The bmiCalculatorMethod displays the sum of the formula used with the given data below.
         @param policyNumber policy number of the policy holder
         @param policyHolderAge age of the policy holder
         
         @param policyHolderHeight height of the policy holder
         @param policyHolderWeight weight of the policy holder
         @param bmiCalculation the bmi calculation of the policy holder
         @param policyPrice price the policy holder must pay for care
         
         @param providerName name of the insurance provider for the policy holder
         @param policyHolderFirstName first name of the policy holder
         @param policyHolderLastName last name of the policy holder
         @param policyHolderSmokingStatus whether the policy holder smokes or not
         */
      double policyNumber;
      double policyHolderAge;
      
      double policyHolderHeight;
      double policyHolderWeight;
      double bmiCalculation;
      double policyPrice;
      
      String providerName;
      String policyHolderFirstName;
      String policyHolderLastName;
      String policyHolderSmokingStatus;
      
   System.out.println("Please enter the Policy Number:");
      policyNumber = userInputScanner.nextDouble();    
       
   System.out.println("Please enter the Provider Name:");
      providerName = userInputScanner.nextLine();
      
   System.out.println("Please enter the Policyholder's First Name:");
      policyHolderFirstName = userInputScanner.nextLine();  
         
   System.out.println("Please enter the Policyholder's Last Name:");
      policyHolderLastName = userInputScanner.nextLine();
      
   System.out.println("Please enter the Policyholder's Age:");
      policyHolderAge = userInputScanner.nextDouble();  
         
   System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker):");
      policyHolderSmokingStatus = userInputScanner.nextLine();
      
   System.out.println("Please enter the Policyholder's Height (in inches):");
      policyHolderHeight = userInputScanner.nextDouble();  
         
   System.out.println("Please enter the Policyholder's Weight (in pounds):");
      policyHolderWeight = userInputScanner.nextDouble();

   }
}