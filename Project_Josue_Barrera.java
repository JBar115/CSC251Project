import java.util.*; // call upon the java util package
import java.io.*;  // call upon the io package
      
public class Project_Josue_Barrera                                
{   
   public static void main(String[] args) throws IOException// main method header 
   {      
      //declare variables 
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;

      
      ArrayList<Policy> policyList = new ArrayList<Policy>(); //array list to store policies 
      
      //file reader setup
      File file = new File ("PolicyInformation.txt"); 
      Scanner inputFile = new Scanner (file);
      
      //counter for non smoker and smokers
      int nonSmokers= 0;
      int smokers = 0; 
      
      while (inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
        // System.out.println("Policy Number: " + policyNumber);
         providerName = inputFile.nextLine();
        // System.out.println("Policy name: " + providerName);
         firstName = inputFile.nextLine();
        // System.out.println("Policy Fname: " + firstName);        
         lastName = inputFile.nextLine(); 
        // System.out.println ("Last name: "+lastName);        
         age = inputFile.nextInt();
        // System.out.println ("Age: "+ age);
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
        // System.out.println ("smokingStatus: "+ smokingStatus);
         height = inputFile.nextDouble();
        // System.out.println ("height: "+ height);
         weight = inputFile.nextDouble();
        // System.out.println ("weight: "+ weight);
         
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();      
      
      
      //creating object 
      policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));     
      }
      inputFile.close();

      
      //print out information about each Policy object
      for(Policy policy : policyList)
      { 
         //display information about the Policy
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.bmiCalc());
         System.out.printf("Policy Price: $%.2f\n", policy.policyRate());
         System.out.println();
         
            if(policy.getSmokingStatus().equalsIgnoreCase("smoker"))
            {//keep track of the number of smokers
              numSmokers++;
             }      
         }
         //print out the number of smokers and non-smokers
          System.out.println("The number of policies with a smoker is: " + numSmokers);
          System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );

   }       
}// EOF