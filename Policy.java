public class Policy // class header 
{  

 //fields 
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder; // field for policyHolder class containing policy holder info 
   
//constructors 
   public Policy() // No-Arg constructor  
   {
      policyNumber ="";
      providerName = " "; 
      policyHolder = null; //leaving this empty by default      
   }   
   
 /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name 
   */
   public Policy(String pNumber, String pName, PolicyHolder holder)    {
      policyNumber = pNumber; 
      providerName = pName;
      policyHolder = holder;
      
   }
   

   /* below will be the list of get and set methods used by the code
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
   
   /**  
   * @return the provider name 
   */
   
   public String getProviderName()
   {
      return providerName;
   }
   
   
   /**  
   * @return the policy holder info 
   */
   public PolicyHolder getPolicyHolder() 
   { 
      return policyHolder; 
   }
 
   public void setPolicyNumber (String pNumber)
   {
      policyNumber = pNumber;
   }
      
    
   
   /**
   * @param providerName the povider name
   */
   
   public void setProviderName(String pName )
   {
      providerName = pName;
   }
   
   /**
   * @param policyHolder The information from policy holder object 
   */   
   public void setPolicyHolder(PolicyHolder holder) 
   { 
      policyHolder = holder; 
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
            
      if (policyHolder.getAge()  > AGE_THRESHOLD)
      {
         price += ADDITIONAL_FEE_AGE;
      }
      
      if (policyHolder.getSmokingStatus().equals("smoker"))
      {
         price += ADDITIONAL_FEE_SMOKING;
      }
      
      if(policyHolder.bmiCalc() > BMI_THRESHOLD)
         price += ((policyHolder.bmiCalc() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
      
      return price;
   } 
   
   //to string method 
   
   public String toString() 
   {
       return String.format(
       "Policy Number: %s%n" +
       "Provider Name: %s%n" +
       "%s%n" + // Includes the PolicyHolder's toString() output
       "Policy Price: $%.2f",
       policyNumber, providerName, policyHolder.toString(), policyRate()
    );
}
   
   
  

     
} //EOF

   
   
