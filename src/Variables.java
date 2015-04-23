/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {
//1.Write a program that creates three variables: an int, a double, and a String.


    public static void main (String args[]) {
        int roomNumber = 113;
        double e = 2.71828;
        String subject = "Computer Science";

        System.out.println("This is room # " + roomNumber);
        System.out.println("e is close to " + e);
        System.out.println("I am learinga bit about " + subject);


        //calling isOdd
        System.out.println(isOdd(6));

        //calling printHelloWorld
        printHelloWorld();
  }
    //2. Consider a method isOdd. What type should it return? What type(s) should it take in? Create the method signature.
    //isOdd should return type boolean. It should take in int
    //the method signature is below:
    public static boolean isOdd(int n){
     if (n % 2 ==0) {
         return false;
     }
        else;
        return true;
    }

    //Consider a method printHelloWorld. What type should it return? What type(s) should it take in? Create the method signature.
    //It shouldn't return anything. It shouldn't take in anything.
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    //4. Consider a method greatestCommonFactor. What type should it return? What type(s) should it take in? Create the method signature.
    // It should return an int and take in an int.
    // method signature:  public static int greatestCommonFactor()

}
