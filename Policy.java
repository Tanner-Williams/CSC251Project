import java.util.Scanner;     //Scanner import for user input

class Policy {
   
   static void bmiCalculatorMethod(double weight, double height) {    //Method to calculate users BMI
      System.out.println((weight * 703) / (height * height));
  }

   public static void main(String[] args) {
   Scanner userInputScanner = new Scanner(System.in);    // universal user input scanner

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