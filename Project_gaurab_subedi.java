import java.util.Scanner;

public class Project_gaurab_subedi
{
   public static void main(String[] args)
   {
      
      Scanner keyboard = new Scanner(System.in);
      
      //variables
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int policyholderAge;
      String smokingStatus;
      double height;
      double weight;
      
      //Policy Numer
      System.out.print("Please enter the policy Number: ");
      policyNumber = keyboard.nextInt();
      
      keyboard.nextLine();
      
      //Provider Name
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      //Policy Holder First Name
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      //Policy Holder Last Name
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      //Policy Holder Age
      System.out.print("Please enter the Policyholder's Age: ");
      policyholderAge = keyboard.nextInt();
      
      keyboard.nextLine();
      
      //Policy Holder Smoking Status  
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      //Policy Holder height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      //Policy Holder weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //Instance for policy object
      Policy policyInsurance = new Policy(policyNumber, providerName, firstName, lastName, policyholderAge, smokingStatus, height, weight);
      
      //Display all the output
      System.out.println();
      System.out.println("Policy Number: " + policyInsurance.getPolicyNumber());
      System.out.println("Provider Name: " + policyInsurance.getProviderName());
      System.out.println("Policyholder's First Name: " + policyInsurance.getPolicyHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policyInsurance.getPolicyHolderLastName());
      System.out.println("Policyholder's Age: " + policyInsurance.getPolicyHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policyInsurance.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policyInsurance.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policyInsurance.getWeight()+ " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policyInsurance.calculateBWI());
      System.out.printf("Policy Price: $%.2f\n", policyInsurance.calculatePolicyPrice());
   
   
   }
}