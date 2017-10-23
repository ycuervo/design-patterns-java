package design.pattern.abstractfactory;

public class PaymentFactoryProducer
{
    public static PaymentFactory getFactory(String choice)
    {

        if(choice.equalsIgnoreCase("CHECK"))
        {
            return new CheckPaymentFactory();

        }
        else if(choice.equalsIgnoreCase("ELECTRONIC"))
        {
            return new ElectronicPaymentFactory();
        }

        return null;
    }
}
