package design.pattern.abstractfactory;

public class WireTransfer implements ElectronicPayment
{
    public String send()
    {
        return "WIRE TRANSFER SEND";
    }
}
