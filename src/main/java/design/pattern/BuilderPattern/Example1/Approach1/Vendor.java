package design.pattern.BuilderPattern.Example1.Approach1;

/**
 * Created by vt091286 on 10/24/2017.
 */
public class Vendor
{
    private final String firstName; //required
    private final String lastName; //required
    private final String vendorType; //optional
    private final String phoneNumber; //optional
    private final String emailAddress; //optional
    private final String department; //optional

    public Vendor(String firstName, String lastName)
    {
        this(firstName, lastName, "");
    }

    public Vendor(String firstName, String lastName, String vendorType)
    {
        this(firstName, lastName, vendorType, "");
    }

    public Vendor(String firstName, String lastName, String vendorType, String phoneNumber)
    {
        this(firstName, lastName, vendorType, phoneNumber,"");
    }

    public Vendor(String firstName, String lastName, String vendorType, String phoneNumber, String emailAddress)
    {
        this(firstName, lastName, vendorType, phoneNumber, emailAddress,"");
    }

    public Vendor(String firstName, String lastName, String vendorType, String phoneNumber, String emailAddress, String department)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vendorType = vendorType;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.department = department;
    }
}

/*
What is the problem with this approach?
1.What if the number of attributes are increased?
2.Code is little confused for client on which constructor to invoke?
*/

