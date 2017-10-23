package design.pattern.abstractfactory;

public abstract class PaymentFactory
{
    abstract CheckPayment getCheckPayment(String checkType);
    abstract ElectronicPayment getElectronicPayment(String electronicPaymentType);
}
