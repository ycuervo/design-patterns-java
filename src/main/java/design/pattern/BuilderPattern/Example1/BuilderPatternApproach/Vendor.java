package design.pattern.BuilderPattern.Example1.BuilderPatternApproach;

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

    private Vendor(VendorBuilder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.vendorType = builder.vendorType;
        this.phoneNumber = builder.phoneNumber;
        this.emailAddress = builder.emailAddress;
        this.department = builder.department;
    }

    public static class VendorBuilder
    {
        private final String firstName;
        private final String lastName;
        private String vendorType;
        private String phoneNumber;
        private String emailAddress;
        private String department;

        public VendorBuilder(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public VendorBuilder vendorType(String vendorType)
        {
            this.vendorType = vendorType;
            return this;
        }

        public VendorBuilder phoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public VendorBuilder emailAddress(String emailAddress)
        {
            this.emailAddress = emailAddress;
            return this;
        }

        public VendorBuilder department(String department)
        {
            this.department = department;
            return this;
        }

        public Vendor build()
        {
            return new Vendor(this);
        }
    }

    private static Vendor getVendor()
    {
        return new Vendor.VendorBuilder("ADAMS", "JOHN")
                .vendorType("AP")
                .phoneNumber("123654987")
                .emailAddress("adams.john@gmail.com")
                .department("Finance")
                .build();
    }

    public static void main(String[] args)
    {
        Vendor.getVendor();
    }
}


/*
Advantages
1.Build a vendor in 1 line of code
2.Object is always in complete state
 */