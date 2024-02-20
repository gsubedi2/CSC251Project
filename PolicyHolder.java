public class PolicyHolder
{
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // No-arg constructor
    public PolicyHolder()
    {
        // Initialize default values or leave them as-is based on your requirements
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    // Parameterized constructor
    public PolicyHolder(String fname, String lname, int ag, String sStatus, double ht, double wt)
    {
        firstName = fname;
        lastName = lname;
        age = ag;
        smokingStatus = sStatus;
        height = ht;
        weight = wt;
    }
    
    public PolicyHolder(PolicyHolder object2) 
    {
        firstName = object2.firstName;
        lastName = object2.lastName;
        age = object2.age;
        smokingStatus = object2.smokingStatus;
        height = object2.height;
        weight = object2.weight;
    }

    // Accessor methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    // Methods for calculating BMI and policy price
    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

  public String toString() 
  {
    return "Policyholder's First Name: " + firstName + "\n" +
           "Policyholder's Last Name: " + lastName + "\n" +
           "Policyholder's Age: " + age + " years\n" +
           "Policyholder's Smoking Status: " + smokingStatus + "\n" +
           "Policyholder's Height: " + height + " inches\n" +
           "Policyholder's Weight: " + weight + " pounds\n" +
           "Policyholder's BMI: " + calculateBMI() + "\n";
   }
}
