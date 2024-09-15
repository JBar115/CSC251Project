public class Policy // class header 
{
   private int currentPolicyNum;
   private String currentProviderName;
   private String currentPolicyHolderFirstName, currentPolicyHolderLastName;
   private int currentPolicyHolderAge;                               // initilizing required varibles  
   private String currentPolicyHolderSmokingStatus;
   private double currentPolicyHolderHeight, currentPolicyHolderWeight; 
   
   private int basePolicyFee= 600; // base fee for policy pricing 
     
   
   public Policy() // No-Arg constructor 
   {
      currentPolicyNum =0;
      currentProviderName = " "; currentPolicyHolderFirstName = " "; currentPolicyHolderLastName = " "; currentPolicyHolderSmokingStatus = "n"; 
      currentPolicyHolderAge = 18; 
      currentPolicyHolderHeight = 0; currentPolicyHolderWeight= 0;
   }   
   
   
   //constructor that sets the intial values of the variables
   public Policy (int policyNum, String providerName, String policyHolderFirstName, String policyHolderLastName, int policyHolderAge,
                  String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight)
   {
      currentPolicyNum = policyNum;
      currentProviderName = providerName;
      currentPolicyHolderFirstName = policyHolderFirstName;
      currentPolicyHolderLastName = policyHolderLastName; 
      currentPolicyHolderAge = policyHolderAge;
      currentPolicyHolderSmokingStatus = policyHolderSmokingStatus;
      currentPolicyHolderHeight = policyHolderHeight;
      currentPolicyHolderWeight = policyHolderWeight;
   }
   
   /* below will be the list of get and set methods used by the code, they will be in the order they were initilized 
   */
   
   public int getPolicyNum ()
   {
      return currentPolicyNum;
   }
   
   public void setPolicynum (int policyNum)
   {
      currentPolicyNum = policyNum;
   }
   
   public String getProviderName()
   {
      return currentProviderName;
   }
   
   public void setProviderName(String providerName )
   {
      currentProviderName = providerName;
   }
   
   public String getPolicyHolderFirstName()
   {
      return currentPolicyHolderFirstName;
   } 
   
   public void setPolicyHolderFirstName(String policyHolderFirstName)
   {
      currentPolicyHolderFirstName = policyHolderFirstName;
   }
   
   public String getPolicyHolderLastName()
   {
      return currentPolicyHolderLastName;
   }
   
   public void setPolicyHolderLastName(String policyHolderLastName)
   {
      currentPolicyHolderLastName = policyHolderLastName;
   }
   
  public int getPolicyHolderAge() 
  {
     return currentPolicyHolderAge;
  }

  public void setPolicyHolderAge(int policyHolderAge) 
  {
      currentPolicyHolderAge = policyHolderAge;
  }

  public String getPolicyHolderSmokingStatus() 
  {
      return currentPolicyHolderSmokingStatus;
  }

  public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus) 
  {
      currentPolicyHolderSmokingStatus = policyHolderSmokingStatus;        
  }

  public double getPolicyHolderHeight() 
  {
      return currentPolicyHolderHeight;
  }

  public void setPolicyHolderHeight(double policyHolderHeight) 
  {
      currentPolicyHolderHeight = policyHolderHeight;
  }

  public double getPolicyHolderWeight() 
  {
      return currentPolicyHolderWeight;
  }

  public void setPolicyHolderWeight(double policyHolderWeight) 
  {
      currentPolicyHolderWeight = policyHolderWeight;
  } // end of set and get methods
    
    
  public double bmiCalc() // calculation for the BMI of the policy holder, multiplies the weight by 703 and divides it by the height squared.
  {
      return (currentPolicyHolderWeight * 703 ) / (currentPolicyHolderHeight*currentPolicyHolderHeight);
  }  
    
  public double policyRate() // calculation for policy rate 
  {
      double bmi = bmiCalc(); // calls on bmiCalc method to set the BMI 
      double policyRate = 0; 
            
      if (currentPolicyHolderAge > 50)
      {
         policyRate += 75.0;
      }
      
      if (currentPolicyHolderSmokingStatus.equals("yes || Yes"))
      {
         policyRate += 100.0;
      }
      
      if ( bmi > 35)
      {
         policyRate += (bmi - 35) * 20 ;
      }
      
      return basePolicyFee + policyRate;      
  } 
      // method to display the details of the policy
      public void displayPolicyDetails() 
      {
       System.out.println("Policy Number: " + getPolicyNum());
       System.out.println("Provider Name: " + getProviderName());
       System.out.println("Policyholder's First Name: " + getPolicyHolderFirstName());
       System.out.println("Policyholder's Last Name: " + getPolicyHolderLastName());
       System.out.println("Policyholder's Age: " + getPolicyHolderAge());        
       // if-statment to display smoker status as Non-Smoker or Smoker 
       if (getPolicyHolderSmokingStatus().equalsIgnoreCase("yes"))
          {
            System.out.println("Policyholder's Smoking Status: Smoker");
          }
           else 
           {
            System.out.println("Policyholder's Smoking Status: Non-Smoker");
           }
       System.out.printf("Policyholder's Height: %,.1f inches\n", getPolicyHolderHeight());
       System.out.printf("Policyholder's Weight: %,.1f pounds\n", getPolicyHolderWeight());
       System.out.printf("Policyholder's BMI: %,.2f\n ", bmiCalc());
       System.out.printf("Policy Price: $%.2f\n", policyRate());
       }   
   
} //EOF

   
   
