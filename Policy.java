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
   
   
    /**
     * Constructor that sets the initial values of the variables
     * @param policyNum the policy number
     * @param providerName the name of provider 
     * @param policyHolderFirstName the policy holder's first name
     * @param policyHolderLastName the policy holder's last name
     * @param policyHolderAge the policy holder's age
     * @param policyHolderSmokingStatus the smoking status of the policy holder
     * @param policyHolderHeight the height of the policy holder
     * @param policyHolderWeight the weight of the policy holder
     */
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
   
   /**
   * @return the policy number
   */
   
   public int getPolicyNum ()
   {
      return currentPolicyNum;
   }
   
   /**
   *
   * @param policyNum the policy number
   */
   
   public void setPolicynum (int policyNum)
   {
      currentPolicyNum = policyNum;
   }
   
   /**  
   * @return the provider name 
   */
   
   public String getProviderName()
   {
      return currentProviderName;
   }
   
   /**
   * @param providerName the povider name
   */
   
   public void setProviderName(String providerName )
   {
      currentProviderName = providerName;
   }
   
   /** 
   * @return The Policy holders first name 
   */
   
   public String getPolicyHolderFirstName()
   {
      return currentPolicyHolderFirstName;
   } 
   
   /**
   *@param policyHolderFirstName the policy holders first name
   */
   
   public void setPolicyHolderFirstName(String policyHolderFirstName)
   {
      currentPolicyHolderFirstName = policyHolderFirstName;
   }
   
   /**
   * @return The policy holders last name 
   */
   
   public String getPolicyHolderLastName()
   {
      return currentPolicyHolderLastName;
   }
   
   /**
   *@param policyHolderLastName the policy holders last name 
   */
   
   public void setPolicyHolderLastName(String policyHolderLastName)
   {
      currentPolicyHolderLastName = policyHolderLastName;
   }
   
  /**
  *@return the policy Holders age
  */ 
   
  public int getPolicyHolderAge() 
  {
     return currentPolicyHolderAge;
  }
  
  /**
  *@param policyHolderAge the policy holders age
  */
   
  public void setPolicyHolderAge(int policyHolderAge) 
  {
      currentPolicyHolderAge = policyHolderAge;
  }
  
  /**
  *@return the policy smoking status
  */ 

  public String getPolicyHolderSmokingStatus() 
  {
      return currentPolicyHolderSmokingStatus;
  }
  
  /**
  *@param policyHolderSmokingStatus the policy holder's smoking status 
  */

  public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus) 
  {
      currentPolicyHolderSmokingStatus = policyHolderSmokingStatus;        
  }
  
  /**
  *@return the policy holder's height
  */ 

  public double getPolicyHolderHeight() 
  {
      return currentPolicyHolderHeight;
  }
  
  /**
  *@param policyHolderHeight the policy holder's height
  */

  public void setPolicyHolderHeight(double policyHolderHeight) 
  {
      currentPolicyHolderHeight = policyHolderHeight;
  }
  
   /**
  *@return the policy holder's weight
  */ 

  public double getPolicyHolderWeight() 
  {
      return currentPolicyHolderWeight;
  }
  
  /**
  *@param policyHolderWeight the policy holder's height
  */

  public void setPolicyHolderWeight(double policyHolderWeight) 
  {
      currentPolicyHolderWeight = policyHolderWeight;
  } // end of set and get methods
    
 /**
 * calculates the body mass index of the policy holder
 * @return the BMI of policy holder 
 */   
  public double bmiCalc() // calculation for the BMI of the policy holder, multiplies the weight by 703 and divides it by the height squared.
  {
      return (currentPolicyHolderWeight * 703 ) / (currentPolicyHolderHeight*currentPolicyHolderHeight);
  }
  
  /**
  * calculates the rate for the user based of the information provided
  * @return the policy rate 
  */  
    
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
  
      /**
      * displays details of policy 
      */
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
       System.out.printf("Policyholder's BMI: %,.2f\n", bmiCalc());
       System.out.printf("Policy Price: $%.2f\n", policyRate());
       System.out.println(); //creates spacing between the various iterations of this method
       }   
   
} //EOF

   
   
