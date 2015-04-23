/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {



    //1. Cool cats
    //    Create 3 cats named Garfield, Pink Panther, and Catwoman.
    //    Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
    //    Assign each of them an age.
    public static void main (String args[]) {
        Cat garfield = new Cat("Garfield");
        garfield.setAge(40);
        garfield.setFavoriteFood("Lasagna");

        Cat pinkPanther = new Cat("Pink Panther");
        pinkPanther.setAge(100);
        pinkPanther.setFavoriteFood("Disco Fries");

        Cat catwoman = new Cat("Catwoman");
        catwoman.setAge(30);
        catwoman.setFavoriteFood("Salmon");


        //2. calling isOlder
        System.out.println(isOlder(catwoman, garfield));

        //3. Best Freinds
        makeBestFriends(pinkPanther, garfield);
        System.out.println("Pink Panther's fave food is now " +pinkPanther.getFavoriteFood() );
        System.out.println("garfield's fave food is now " + garfield.getFavoriteFood());

        //4. Calling makeKitten
        makeKitten(catwoman, pinkPanther);
        System.out.println((makeKitten(catwoman, pinkPanther)).getName());

        //5. Make a person to adopt a cat
        Person charlyn = new Person("Charlyn");
        charlyn.setCity("Brooklyn");
        charlyn.setPhoneNumber("(718)1234567");
        //Test - I'm a real girl!!! yay!
        System.out.println(charlyn.getName() + " " + charlyn.getCity() + " " + charlyn.getPhoneNumber());
        //Test to see if owner was set correctly
        adoption(garfield, charlyn);
        System.out.println(garfield.getOwner().getName()); //Boom
        //5. Bonus
        adoption(catwoman, charlyn);
        //System.out.println();

        //6. Calling isFree
        System.out.println(isFree(pinkPanther));

        //7. Calling isSiblng
        System.out.println(isSibling(pinkPanther, garfield)); //Bam!
    }
    //2. Write a method called isOlder that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.
    public static boolean isOlder(Cat cat1, Cat cat2){
        return (cat1.getAge() > cat2.getAge());
    }
    //3. Write a method called makeBestFriends that takes 2 Cats as parameters and sets both of their favorite foods to the same thing.
    public static void makeBestFriends (Cat cat1, Cat cat2){
        cat1.setFavoriteFood("Pickles");
        cat2.setFavoriteFood("Pickles");
    }
    //4. Kitten
    //Write a method called makeKitten that takes 2 Cats as parameters and returns a new Cat
    // with a name that is the combination of the 2 parent Cats' names. The age of the new Cat
    // should be 0.
    public static Cat makeKitten(Cat cat1, Cat cat2) {
        Cat newKitten = new Cat();
        String newKittenName = cat1.getName()+cat2.getName();
        newKitten.setName(newKittenName);
        newKitten.setAge(0);
        return newKitten;
    }
    //5. Write a method called adoption that takes 1 Cat and 1 Person as a paramater and sets
    // the Cat's owner to be the Person.
    //First, make a person up in main
    public static void adoption(Cat cat, Person charlyn) {
        cat.setOwner(charlyn);
    }
    //6. Write a method called isFree that checks whether or not a Cat has an owner.
    public static boolean isFree(Cat cat) {
        return (cat.getOwner() != null);
    }

    //7. Write a method called isSibling that checks whether or not 2 Cats have the same owner.
    public static boolean isSibling(Cat cat1, Cat cat2){
        return (cat1.getOwner() == cat2.getOwner());
    }


}

