public class Policy
{
   private int policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String smokingStatus;
   private double height;
   private double weight;
   
   // No-arg constructor
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
   
   //Constructor with arguements
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
   //setters and getters for PolicyNumber
   public void setPolicyNumber(int pNumber)
   {
      policyNumber = pNumber;
   }
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   //Settera and getters for Provider Name
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   //Setters and getters for Policy Holder First name
   public void setPolicyHolderFirstName(String firstName)
   {
      policyholderFirstName = firstName;
   }
   
   public String getPolicyHolderFirstName()
   {
      return policyholderFirstName;
   }
   
   //setters and getters for policy holder last name
   public void setPolicyHolderLastName(String lastName)
   {
      policyholderLastName = lastName;
   }
   
   public String getPolicyHolderLastName()
   {
      return policyholderLastName;
   }
   
   //setters and getters for policy holder age
   public void setPolicyHolderAge(int age)
   {
      policyholderAge = age;
   }
   
   public int getPolicyHolderAge()
   {
      return policyholderAge;
   }
   
   //setters and getters for Smoking Status
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   //setters and getters for height
   public void setHeight(double ht)
   {
      height = ht;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   //setters and getters for weight
   public void setWeight(double wt)
   {
      weight = wt;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   //BWI CALCULATION
   public double calculateBWI()
   {
      return (weight * 703) / (height * height);
   }
   
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