package design.pattern.singleton;

public class Environment
{
    /**
     * static variable for single instance.
     */
    private static Environment singleInstance = new Environment();

    /**
     * private constructor so it can't be instantiated outside of this class.
     */
    private Environment()
    {
    }

    public static Environment getInstance()
    {
        return singleInstance;
    }
}
