/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
      System.out.println(isOdd(3));
      System.out.println(isMultipleOfThree(6));
      System.out.println(isOddAndIsMultipleOfThree(9));
      fizzMultipleofThree(6);
      System.out.println(isFromLondon(newMike()));
      fiveLettersLong(newMike());

  }
    //1. Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
    public static boolean isOdd (int n){
        return (n % 2 == 0);
    }
    //2. Write a method isMultipleOfThree that takes in an int n. Returns true if n is a multiple of
    // three, and false otherwise.
    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0);
    }
    //3. Write a method isOddAndIsMultipleOfThree that takes in an int n. Returns true if n is both
    // odd and a multiple of three, and false otherwise.
    public static boolean isOddAndIsMultipleOfThree(int n) {
        return ((!(n % 2 == 0) )&& (n % 3 ==0));
    }
    //4. Write a method isOddAndIsMultipleOfThree2 - if you used isOdd and isMultipleofThree
    // in your last solution, don't use it this time. If you did not, write this method
    // building on your last methods.
    public static boolean isOddAndIsMultipleOfThree2(int n) {
        return ((!isOdd(n)) && isMultipleOfThree(n));
    }
    //5. Write a method fizzMultipleofThree that takes in an int n and prints "Fizz"
    // if n is a multiple of three, and prints n otherwise.
    public static String fizzMultipleofThree (int n){
        String f = "Fizz";
        String nope = "n";
        if (n % 3 == 0) {
            System.out.println("Fizz");
            return f;
        }
        else
            System.out.println("n");
            return nope;
    }
    // 1. (Person) - Write a method that takes in a Person and
    // returns true if the person is from London, and false otherwise.
    public static Person newMike(){
        Person mike = new Person("Mike");
        mike.setCity("London");
        return mike;

    }
    public static boolean isFromLondon(Person p1) {
        return (p1.getCity().equals("London"));
    }

    //2. (Person) -Write a method that takes in a Person
    // and prints the name if the person has a name longer than 5
    // characters, and otherwise prints "Name is too short."
    public static void fiveLettersLong(Person p1){
        if (p1.getName().length() >= 5) {
            System.out.println(p1.getName());
        }
        else {
            System.out.println("Name is too short");
        }
    }

}

