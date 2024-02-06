public class Policy
{
    // Instance variables
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double height;
    private double weight;
   
   //no-arg constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyholderFirstName = "";
      policyholderLastName = "";
      policyholderAge = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   /**
      Constructor that accepts an arguement for the Policy.
      @param pNumber the policy number
      @param pName the provider Name
      @param firstName the policy holder first Name
      @param lastName the policy holder last name
      @param age the policy holder age
      @param sStatus the smoking status
      @param ht the height
      @param wt the weight
   */
   public Policy(int pNumber,String pName, String firstName,String lastName, int age, String sStatus, double ht, double wt)
   {
      policyNumber = pNumber;
      providerName = pName;
      policyholderFirstName = firstName;
      policyholderLastName = lastName;
      policyholderAge = age;
      smokingStatus = sStatus;
      height = ht;
      weight = wt;
   }
   /**
      Mutator (setter) method
      @Param pNumber the policy number
   */
   public void setPolicyNumber(int pNumber)
   {
      policyNumber = pNumber;
   }
   /**
      Accessor (getter) method
      @return the policy number
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   } 
   /**
      Mutator (setter) method
      @Param pname the provider name
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   /**
      Accessor (getter) method
      @return the provider name
   */
   public String getProviderName()
   {
      return providerName;
   }
   /**
      Mutator (setter) method
      @Param firstName the policy holder first name
   */  
   public void setPolicyHolderFirstName(String firstName)
   {
      policyholderFirstName = firstName;
   }
   /**
      Accessor (getter) method
      @return the policy holder first name
   */
   public String getPolicyHolderFirstName()
   {
      return policyholderFirstName;
   }
   /**
      Mutator (setter) method
      @Param firstName the policy holder last name
   */ 
   public void setPolicyHolderLastName(String lastName)
   {
      policyholderLastName = lastName;
   }
   /**
      Accessor (getter) method
      @return the policy holder last name
   */
   public String getPolicyHolderLastName()
   {
      return policyholderLastName;
   }
    /**
      Mutator (setter) method
      @Param age the policy holder age
   */ 
   public void setPolicyHolderAge(int age)
   {
      policyholderAge = age;
   }
   /**
      Accessor (getter) method
      @return the policy age
   */
   public int getPolicyHolderAge()
   {
      return policyholderAge;
   }
   /**
      Mutator (setter) method
      @Param sStatus the policy holder smoking status
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   /**
      Accessor (getter) method
      @return the policy holder smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /**
      Mutator (setter) method
      @Param ht the policy holder height
   */
   public void setHeight(double ht)
   {
      height = ht;
   }
   /**
      Accessor (getter) method
      @return the policy holder height
   */
   public double getHeight()
   {
      return height;
   }
   /**
      Mutator (setter) method
      @Param ht the policy holder weight
   */
   public void setWeight(double wt)
   {
      weight = wt;
   }
   /**
      Accessor (getter) method
      @return the policy holder weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      Method for getting the calculation for the BMI of the policyholder
      @return the BMI of the policy holder
   */
   public double calculateBWI()
   {
      return (weight * 703) / (height * height);
   }
   /**
      Method for calculating and returning the price of the insurance policy
      @return the policy price
   */
   public double calculatePolicyPrice()
   {
      //get the bmi value
      double bmi = calculateBWI();
      //additional fee
      double additionalFee = (bmi - 35) * 20;
      //base fee
      double policyPrice = 600.00;
      
      if(policyholderAge > 50)
      {
         policyPrice += 75.00;
      }
      if(smokingStatus.equalsIgnoreCase("smoker"))
      {
         policyPrice += 100.00;
      }
      if(bmi > 35)
      {
         policyPrice += additionalFee;
      }
      return policyPrice;
   }
   
   
}