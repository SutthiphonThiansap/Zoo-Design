package Lib;

public class Eagle extends Bird implements flyable
{
    public Eagle(String name)
    {
        super(name);
    }

    @Override
    public String makeSound()
    {
        return "Screech!";
    }

    @Override
    public String fly() 
    {
        return "The eagle soars through the sky.";
    }

}
