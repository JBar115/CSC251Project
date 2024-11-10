class PolicyHolder
{
   // fields 
   private String FirstName, LastName;
   private int age;                              
   private String smokingStatus;
   private double height, weight;  
   
   
   //No-ARG constructor 
   public PolicyHolder()
   {    
      FirstName = " "; LastName = " "; smokingStatus = ""; 
      age = 18; 
      height = 0; 
      weight= 0;    
   }
  
  /**
   Constructor that accepts arguments for each field
   @param fName The Policyhodler's first name 
   @param lName The Policyholder's last name 
   @param a The Policyholder's age 
   @param sStatus The Policyholder's smoking status 
   @param h The Policyholder's height 
   @param w The Policytholder's weight 
   */

   public PolicyHolder(String fName, String lName,int a, String sStatus, double h, double w) 
   {
      FirstName = fName; 
      LastName = lName; 
      age = a; 
      smokingStatus = sStatus; 
      height = h; 
      weight = w;
   }


//getters

   public String getFirstName()
   {
      return FirstName;
   } 
   
   public String getLastName()
   {
      return LastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   //Setters 
   
   /**
   *@param policyHolderFirstName the policy holders first name
   */
   
   public void setFirstName(String fName)
   {
      FirstName = fName;
   }
   
   /**
   *@param policyHolderLastName the policy holders last name 
   */
   
   public void setLastName(String lName)
   {
      LastName = lName;
   }
   
   /**
  *@param policyHolderAge the policy holders age
  */
   
   public void setAge(int a) 
   {
      age = a;
   }
  
  /**
  *@param policyHolderSmokingStatus the policy holder's smoking status 
  */

   public void setSmokingStatus(String sStatus) 
   {
      smokingStatus = sStatus;       
   }
  
    
  /**
  *@param policyHolderHeight the policy holder's height
  */

   public void setHeight(double h) 
   {
      height = h;
   }
  
  /**
  *@param policyHolderWeight the policy holder's height
  */

   public void setWeight(double w) 
   {
      weight = w;
   }
    
      /**
       * calculates the body mass index of the policy holder
      * @return the BMI of policy holder 
       */  
  
   public double bmiCalc() // calculation for the BMI of the policy holder, multiplies the weight by 703 and divides it by the height squared.
   {
      final double CONVFACTOR = 703;
      return (weight * CONVFACTOR ) / (height*height);
   }
   
   
   
   






   
   
   
   






   
   












}