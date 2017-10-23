package design.pattern.abstractfactory;

public class ElectronicFundsTransfer implements ElectronicPayment
{
    public String send()
    {
        return "EFT SEND";
    }
}
