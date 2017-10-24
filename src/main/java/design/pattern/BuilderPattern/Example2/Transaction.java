package design.pattern.BuilderPattern.Example2;

/**
 * Created by vt091286 on 10/24/2017.
 */
public class Transaction
{
    private String company;
    private String bank;
    private String currency;
    private String vendorType;

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getBank()
    {
        return bank;
    }

    public void setBank(String bank)
    {
        this.bank = bank;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getVendorType()
    {
        return vendorType;
    }

    public void setVendorType(String vendorType)
    {
        this.vendorType = vendorType;
    }
}
