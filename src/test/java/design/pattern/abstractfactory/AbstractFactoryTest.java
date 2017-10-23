package design.pattern.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest
{
    @Test
    public void testAbstractFactory()
    {
        PaymentFactory checkFactory = PaymentFactoryProducer.getFactory("CHECK");

        CheckPayment apCheck = checkFactory.getCheckPayment("AP");
        CheckPayment prCheck = checkFactory.getCheckPayment("PR");

        Assert.assertEquals("PRINT AP CHECK", apCheck.print());
        Assert.assertEquals("PRINT PR CHECK", prCheck.print());

        PaymentFactory electronicPaymentFactory = PaymentFactoryProducer.getFactory("ELECTRONIC");

        ElectronicPayment eft = electronicPaymentFactory.getElectronicPayment("EFT");
        ElectronicPayment wt = electronicPaymentFactory.getElectronicPayment("WT");

        Assert.assertEquals("EFT SEND", eft.send());
        Assert.assertEquals("WIRE TRANSFER SEND", wt.send());
    }
}
