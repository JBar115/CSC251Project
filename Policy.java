public class Policy // class header 
{   
   private String policyNumber;
   private String providerName;
   private String FirstName, LastName;
   private int age;                               // fields  
   private String smokingStatus;
   private double height, weight;  
    
   
   public Policy() // No-Arg constructor 
   {
      policyNumber ="";
      providerName = " "; FirstName = " "; LastName = " "; smokingStatus = ""; 
      age = 18; 
      height = 0; weight= 0;
   }   
   
 /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      FirstName = fName;
      LastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   

   /* below will be the list of get and set methods used by the code, they will be in the order they were initilized 
   */
   
   /**
   * @return the policy number
   */
   
   public String getPolicyNumber ()
   {
      return policyNumber;
   }
   
   /**
   *
   * @param policyNum the policy number
   */
   
   public void setPolicyNumber (String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**  
   * @return the provider name 
   */
   
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   * @param providerName the povider name
   */
   
   public void setProviderName(String pName )
   {
       providerName = pName;
   }
   
   /** 
   * @return The Policy holders first name 
   */
   
   public String getFirstName()
   {
      return FirstName;
   } 
   
   /**
   *@param policyHolderFirstName the policy holders first name
   */
   
   public void setFirstName(String fName)
   {
      FirstName = fName;
   }
   
   /**
   * @return The policy holders last name 
   */
   
   public String getLastName()
   {
      return LastName;
   }
   
   /**
   *@param policyHolderLastName the policy holders last name 
   */
   
   public void setLastName(String lName)
   {
      LastName = lName;
   }
   
  /**
  *@return the policy Holders age
  */ 
   
  public int getAge() 
  {
     return age;
  }
  
  /**
  *@param policyHolderAge the policy holders age
  */
   
  public void setAge(int a) 
  {
      age = a;
  }
  
  /**
  *@return the policy smoking status
  */ 

  public String getSmokingStatus() 
  {
      return smokingStatus;
  }
  
  /**
  *@param policyHolderSmokingStatus the policy holder's smoking status 
  */

  public void setSmokingStatus(String sStatus) 
  {
      smokingStatus = sStatus;       
  }
  
  /**
  *@return the policy holder's height
  */ 

  public double getHeight() 
  {
      return height;
  }
  
  /**
  *@param policyHolderHeight the policy holder's height
  */

  public void setHeight(double h) 
  {
      height = h;
  }
  
   /**
  *@return the policy holder's weight
  */ 

  public double getWeight() 
  {
      return weight;
  }
  
  /**
  *@param policyHolderWeight the policy holder's height
  */

  public void setWeight(double w) 
  {
      weight = w;
  } 
  // end of set and get methods
    
 /**
 * calculates the body mass index of the policy holder
 * @return the BMI of policy holder 
 */   
  public double bmiCalc() // calculation for the BMI of the policy holder, multiplies the weight by 703 and divides it by the height squared.
  {
     final double CONVFACTOR = 703;

      return (weight * CONVFACTOR ) / (height*height);
  }
  
  /**
  * calculates the rate for the user based of the information provided
  * @return the policy rate 
  */  
    
  public double policyRate() // calculation for policy rate 
  {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
            
      if (age > AGE_THRESHOLD)
      {
         price += ADDITIONAL_FEE_AGE;
      }
      
      if (smokingStatus.equals("smoker"))
      {
         price += ADDITIONAL_FEE_SMOKING;
      }
      
      if(bmiCalc() > BMI_THRESHOLD)
         price += ((bmiCalc() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
      
      return price;
  } 
  
      /**
      * displays details of policy 
      */
      // method to display the details of the policy
      public void displayPolicyDetails() 
      {
       System.out.println("Policy Number: " + getPolicyNumber());
       System.out.println("Provider Name: " + getProviderName());
       System.out.println("Policyholder's First Name: " + getFirstName());
       System.out.println("Policyholder's Last Name: " + getLastName());
       System.out.println("Policyholder's Age: " + getAge());        
       // if-statment to display smoker status as Non-Smoker or Smoker 
       if (getSmokingStatus().equalsIgnoreCase("yes"))
          {
            System.out.println("Policyholder's Smoking Status: Smoker");
          }
           else 
           {
            System.out.println("Policyholder's Smoking Status: Non-Smoker");
           }
       System.out.printf("Policyholder's Height: %,.1f inches\n", getHeight());
       System.out.printf("Policyholder's Weight: %,.1f pounds\n", getWeight());
       System.out.printf("Policyholder's BMI: %,.2f\n", bmiCalc());
       System.out.printf("Policy Price: $%.2f\n", policyRate());
       System.out.println(); //creates spacing between the various iterations of this method
       }   
   
} //EOF

   
   
