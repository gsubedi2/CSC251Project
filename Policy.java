public class Policy
{
    // Instance variable
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    // No-arg constructor
    public Policy()
    {
        // Initialize default values or leave them as-is based on your requirements
        policyNumber = 0;
        providerName = "";
        policyHolder = new PolicyHolder();
    }

    // Parameterized constructor
    public Policy(int pNumber, String pName, PolicyHolder pHolder)
    {
        policyNumber = pNumber;
        providerName = pName;
        policyHolder = new PolicyHolder(pHolder);//to avoid security holes       
    }

    // Accessor methods
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public PolicyHolder getPolicyHolder()
    {
        return policyHolder;
    }

    // Method for calculating policy price
    public double calculatePolicyPrice()
    {
        double bmi = policyHolder.calculateBMI();
        double additionalFee = (bmi - 35) * 20;
        double policyPrice = 600.00;

        if (policyHolder.getAge() > 50)
        {
            policyPrice += 75.00;
        }
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
        {
            policyPrice += 100.00;
        }
        if (bmi > 35)
        {
            policyPrice += additionalFee;
        }

        return policyPrice;
    }

   public String toString()
   {
    return "Policy Number: " + policyNumber +
           "\nProvider Name: " + providerName +
           "\n" + policyHolder.toString() + 
           "\nPolicy Price: $" + calculatePolicyPrice();
   }
}
