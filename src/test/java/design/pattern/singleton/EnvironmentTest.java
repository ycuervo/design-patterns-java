package design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class EnvironmentTest
{
    @Test
    public void testSingleton()
    {
        Environment environment1 = Environment.getInstance();
        Environment environment2 = Environment.getInstance();

        Assert.assertEquals("This should be the same object.", environment1, environment2);
    }
}
