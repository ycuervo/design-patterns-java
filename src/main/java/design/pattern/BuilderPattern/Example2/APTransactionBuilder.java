package design.pattern.BuilderPattern.Example2;

/**
 * Created by vt091286 on 10/24/2017.
 */
public class APTransactionBuilder implements TransactionBuilder
{
    Transaction apTransaction = new Transaction();

    public void addCompany()
    {
        apTransaction.setCompany("US Company");
    }

    public void addBank()
    {
        apTransaction.setBank("US Bank");
    }

    public void addCurrency()
    {
        apTransaction.setCurrency("US Currency");
    }


    public void vendorType()
    {
        apTransaction.setVendorType("AP");
    }

    public Transaction getTransaction()
    {
        return apTransaction;
    }
}
