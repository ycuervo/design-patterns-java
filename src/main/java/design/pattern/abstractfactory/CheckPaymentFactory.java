package design.pattern.abstractfactory;

public class CheckPaymentFactory extends PaymentFactory
{
    CheckPayment getCheckPayment(String checkType)
    {
        if(checkType.equals("AP"))
        {
            return new APCheck();
        }

        if(checkType.equals("PR"))
        {
            return new PRCheck();
        }

        return null;
    }

    ElectronicPayment getElectronicPayment(String electronicPaymentType)
    {
        return null;
    }
}
