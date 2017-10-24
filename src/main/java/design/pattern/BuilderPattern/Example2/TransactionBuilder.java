package design.pattern.BuilderPattern.Example2;

/**
 * Created by vt091286 on 10/24/2017.
 */
public interface TransactionBuilder
{
    void addCompany();
    void addBank();
    void addCurrency();
    void vendorType();
    Transaction getTransaction();
}
