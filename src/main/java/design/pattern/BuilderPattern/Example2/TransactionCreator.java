package design.pattern.BuilderPattern.Example2;

/**
 * Created by vt091286 on 10/24/2017.
 */
public class TransactionCreator
{
    public static void main(String[] args)
    {
        TransactionBuilder transaction = new APTransactionBuilder();
        Transaction apTransaction = transaction.getTransaction();
        System.out.println(apTransaction.getBank());
        System.out.println(apTransaction.getCompany());
        System.out.println(apTransaction.getCurrency());
        System.out.println(apTransaction.getVendorType());

        TransactionBuilder transaction2 = new PRTransactionBuilder();
        Transaction prTransaction = transaction2.getTransaction();
        System.out.println(prTransaction.getBank());
        System.out.println(prTransaction.getCompany());
        System.out.println(prTransaction.getCurrency());
        System.out.println(prTransaction.getVendorType());
    }
}
