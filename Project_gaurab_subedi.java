import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project_gaurab_subedi
{
   public static void main(String[] args) throws IOException 
   {
      // Specify the file name
      String fileName = "PolicyInformation.txt";
   
      // Create a structure to store Policy objects
      List<Policy> policies = new ArrayList<>();
   
      // Initialize the Scanner using a File object
      try (Scanner inputFile = new Scanner(new File(fileName))) 
      {
         
         while (inputFile.hasNext()) 
         {
            // Read data from the file and create a Policy object
            int policyNumber = inputFile.nextInt();
            inputFile.nextLine();
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            int age = inputFile.nextInt();
            inputFile.nextLine();
            String smokingStatus = inputFile.nextLine();
            double height = inputFile.nextDouble();
            double weight = inputFile.nextDouble();

            // Create a PolicyHolder object
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            
            // Create a Policy object with the PolicyHolder
            Policy policy = new Policy(policyNumber, providerName, policyHolder);
            
            policies.add(policy);
         }
      
         // Display information for each Policy object
         for (Policy policy : policies) 
         {
            System.out.println();
            System.out.println(policy.toString());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
         }
      
         // Display the total number of Policy objects
         System.out.println("\nThere were " + policies.size() + " Policy objects created.");

         // Display the number of smokers and non-smokers
         int smokerCount = 0;
         int nonSmokerCount = 0;
         for (Policy policy : policies) 
         {
            if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) 
            {
               smokerCount++;
            } 
            else if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("non-smoker")) 
            {
               nonSmokerCount++;
            }
         }
      
         System.out.println("The number of policies with a smoker is: " + smokerCount);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
      
      }
   }
}
