package design.pattern.BuilderPattern.Example2;

/**
 * Created by vt091286 on 10/24/2017.
 */
public class PRTransactionBuilder implements TransactionBuilder
{
    Transaction prTransaction = new Transaction();

    public void addCompany()
    {
        prTransaction.setCompany("CAN Company");
    }

    public void addBank()
    {
        prTransaction.setBank("CAN Bank");
    }

    public void addCurrency()
    {
        prTransaction.setCurrency("CAN Currency");
    }


    public void vendorType()
    {
        prTransaction.setVendorType("PR");
    }

    public Transaction getTransaction()
    {
        return prTransaction;
    }
}
