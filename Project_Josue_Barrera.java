import java.util.*; // call upon the java util package
import java.io.*;  // call upon the io package
      
public class Project_Josue_Barrera                                
{   
   public static void main(String[] args) throws IOException// main method header 
   {      
      ArrayList<Policy> policies = new ArrayList<>(); //array list to store policies 
      
      //file reader setup
      File file = new File ("PolicyInformation.txt"); 
      Scanner inputFile = new Scanner (file);
      
      //counter for non smoker and smokers
      int nonSmokers= 0;
      int smokers = 0; 
      
      while (inputFile.hasNext())
      {
      int policyNum = inputFile.nextInt();
      inputFile.nextLine(); //buffer 
      String providerName=inputFile.nextLine();
      String policyHolderFirstName=inputFile.nextLine();
      String policyHolderLastName=inputFile.nextLine(); 
      int policyHolderAge=inputFile.nextInt();
      inputFile.nextLine(); // buffer
      String policyHolderSmokingStatus=inputFile.nextLine();
      double policyHolderHeight= inputFile.nextDouble();
      double policyHolderWeight=inputFile.nextDouble();
      inputFile.nextLine(); // buffer  
      
      if ( policyHolderSmokingStatus.equalsIgnoreCase("smoker"))
      {
         smokers++;
      }
      else
      {
         nonSmokers++;
      }
             
      
      //creating object 
      Policy currentPolicy = new Policy (policyNum, providerName, policyHolderFirstName,
       policyHolderLastName,  policyHolderAge,                                               
      policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
      
     policies.add(currentPolicy); // Add the Policy object to the ArrayList policies 
      }
      inputFile.close();

      
      
      for (Policy policy : policies)
      { 
      policy.displayPolicyDetails(); // calls on method to display detailes of the policy 
      }
      
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
       
   } // end of main method    
}// EOF