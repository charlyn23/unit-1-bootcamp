/**
 * Created by alexandraqin on 4/14/15.
 */
import java.util.Random;
public class Methods {

  public static void main (String args[]) {
      System.out.println(calculateSquare(2));
      System.out.println(calculateSquareRoot(16));
      System.out.println(calculateSquareRoot(25));
      System.out.println(toLowerCase("HI Guys"));
      System.out.println(isMultiple(5,31));
      prettyInteger(10);
      System.out.println(random(1, 10));

  }
    //1. Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer.
    public static int calculateSquare(int n){
        int square = n*n;
        return square;
    }

    //2. Write a method called calculateSquareRoot that takes an int as a parameter and returns the square root of that integer.
    public static double calculateSquareRoot(int n){
        double squareRoot = Math.sqrt(n);
        return squareRoot;
    }

    //3. Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
    public static String toLowerCase(String s){
        String lowerCase = s.toLowerCase();
        return lowerCase;
    }

    //4. Write a method called isMultiple that takes 2 int parameters and determines if the second is a multiple of the first.
    public static boolean isMultiple (int a, int b) {
        return (b % a == 0);
    }

    //5. Write a method called prettyInteger that takes an int as a parameter and prints the integer surrounded by asterisks with the length of each side equal to the given integer.
    public static void prettyInteger(int n) {
        for (int i = 0; i < n; i++) {
            String stars = "";
            stars += "*";
            System.out.print(stars);
        }
        System.out.print(" " + n + " ");
        for (int i = 0; i < n; i++) {
            String stars = "";
            stars += "*";
            System.out.print(stars);
        }
    }
    //6. Write a method called random that takes 2 ints as parameters and returns a random int within that range.
    public static int random(int start, int end) {
        if (end < start){
            System.out.println("first entry must be smaller than second");
        }
        for (int i = start; i <= end; i++){
            Random rando = new Random();
            return rando.nextInt();
        }
        return random(start, end);
    }


}
