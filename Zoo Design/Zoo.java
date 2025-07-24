import java.util.ArrayList;

import Lib.*;
public class Zoo 
{
    public static void main(String[] args) 
    {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Lion"));
        animals.add(new Eagle("Eagle"));
        animals.add(new Penguin("Penguin"));
        animals.add(new Dolphin("Dolphin"));
        System.out.println("======Sound======");
        for(Animal animal : animals )
        {
            System.out.println(animal.getName() + " : " + animal.makeSound());
        }

        System.out.println("======Abilities======");
        for(Animal animal : animals )
        {
            if(animal instanceof flyable)
            {
                System.out.println(animal.getName() + " : " + ((flyable) animal).fly());
            }
            else if(animal instanceof Swimable)
            {
                System.out.println(animal.getName() + " : " + ((Swimable) animal).swim());
            }
            else
            {
                System.out.println(animal.getName() + " : " + "is walking.");
            }
        }
        
    }
}
