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
      
      
      //creating objects
         PolicyHolder holder = new PolicyHolder (firstName, lastName, age, smokingStatus, height, weight);
         Policy policy = new Policy (policyNumber, providerName, holder);
     
         policyList.add(policy); //edited to work with policy counter  
         
        if (holder.getSmokingStatus().equalsIgnoreCase("smoker")) //moved inside to while loop to stay in scope 
        {
       
            numSmokers++;
           }
        
         
         
      }
      inputFile.close();
   
      
      //print out information about each Policy object
      for(Policy policy : policyList)
      { 
         System.out.println(policy);  //to string method from policy class which contains the to string method from Policy holder class (pretty cool :))           
         System.out.println();         
      
      }
      //print out the number of smokers and non-smokers
      System.out.println();
      System.out.println("Total Policies Created: " + Policy.getPolicyCounter());
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );   
   }       
}// EOF