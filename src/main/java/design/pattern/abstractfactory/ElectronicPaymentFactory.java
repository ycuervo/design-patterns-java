package design.pattern.abstractfactory;

public class ElectronicPaymentFactory extends PaymentFactory
{
    CheckPayment getCheckPayment(String checkType)
    {
        return null;
    }

    ElectronicPayment getElectronicPayment(String electronicPaymentType)
    {
        if(electronicPaymentType.equals("EFT"))
        {
            return new ElectronicFundsTransfer();
        }

        if(electronicPaymentType.equals("WT"))
        {
            return new WireTransfer();
        }

        return null;
    }
}
