import java.util.Scanner; // call upon the scanner class
     
public class Project_Josue_Barrera                                
{   
   public static void main(String[] args) // main method header 
   { 
      Scanner keyboard = new Scanner (System.in); // scanner set up 
      
      // inputs for user data
      System.out.print("Enter Policy Number: "); 
        int policyNum = keyboard.nextInt();
        keyboard.nextLine(); // buffer
        
        System.out.print("Enter Provider Name: ");
        String providerName = keyboard.nextLine();

        System.out.print("Enter Policyholder's First Name: ");
        String policyHolderFirstName = keyboard.nextLine();

        System.out.print("Enter Policyholder's Last Name: ");
        String policyHolderLastName = keyboard.nextLine();

        System.out.print("Enter Policyholder's Age: ");
        int policyHolderAge = keyboard.nextInt();
        keyboard.nextLine(); // buffer 

        System.out.print("Enter Policyholder's Smoking Status (yes/no): ");
        String policyHolderSmokingStatus = keyboard.nextLine();
        // while loop to validate user input 
         while (!policyHolderSmokingStatus.equalsIgnoreCase("yes") && !policyHolderSmokingStatus.equalsIgnoreCase("no"))
               {
                  System.out.print("Please enter either 'Yes' or 'No': ");
                  policyHolderSmokingStatus = keyboard.nextLine();
               }
        
        System.out.print("Enter Policyholder's Height (in inches): ");
        double policyHolderHeight = keyboard.nextDouble();

        System.out.print("Enter Policyholder's Weight (in pounds): ");
        double policyHolderWeight = keyboard.nextDouble();
        
      // creates a new object using the policy class
      Policy currentPolicy = new Policy (policyNum, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge,
                          policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);

      currentPolicy.displayPolicyDetails(); // calls on method to display detailes of the policy 

   } // end of main method    
}// EOF