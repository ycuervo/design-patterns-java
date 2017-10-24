package design.pattern.BuilderPattern.Example1.Approach2;

/**
 * Created by vt091286 on 10/24/2017.
 */
public class Vendor
{
    private String firstName; //required
    private String lastName; //required
    private String vendorType; //optional
    private String phoneNumber; //optional
    private String emailAddress; //optional
    private String department; //optional

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getVendorType()
    {
        return vendorType;
    }

    public void setVendorType(String vendorType)
    {
        this.vendorType = vendorType;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }
}


/*
What is the problem with this approach?
1.If the object has to be created with all 5 attributes, the object will not have a complete state untill all setter are called
2.Benefit of immutable is gone
*/
