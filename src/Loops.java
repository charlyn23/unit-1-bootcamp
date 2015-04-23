/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops
{

    public static void main(String args[])
    {
        //1.Write a method that prints the numbers 1 through 10 using a loop.
//        for(int i = 1; i <= 10; i++)
//        {
//            System.out.println(i);
//        }
        //2.Write a method that prints the numbers 1 through 10 using a different kind of loop.
//        int x = 0;
//        while(x <= 10)
//        {
//            System.out.println(x++);
//        }
        //3. Calling method
        //printUpToN(12);

        //4. Calling method
        //printEvenToN(13);

        //5. Calling method
        //printSumOfOneThroughTen();

        //6. Calling method
        //printSumOfOneThruN(12);

        //7. Calling printSumOfOneThruN method for 1000
        //printSumOfOneThruN(1000);

        //8. Calling method
        //printStringNTimes("hello", 3);

        //9. Calling method
        //printStringNTimesConcat("Howdy", 5);

        //10. Calling method. Should print 0,1,1,2,3,5,8,13,21,34,55
        //firstTenFib();

        //11. Calling method
        System.out.println(sumOfFirstTenFib());

        //12. Calling method
        //nthFibonacci(8);


    }

    //3. Write a method that takes in an int n and prints the numbers 1 through n.
    public static int printUpToN(int n)
    {
        int i;
        for(i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
        return i;
    }

    //4. Write a method that takes in an int n and prints the even numbers 2 through n.
    public static int printEvenToN(int n)
    {
        int i;
        for(i = 2; i <= n; i++)
        {

            if(i % 2 == 0)
            {
                System.out.println(i);
            }

        }
        return i;
    }

    //5. Write a method that prints the sum of 1 through 10 using a loop.
    public static void printSumOfOneThroughTen()
    {
        int sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    //6. Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
    public static int printSumOfOneThruN(int n)
    {
        int i;
        int sum = 0;
        for(i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        return i;
    }
    //7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
    //See main

    //8. Write a method that takes in an int n and a String s and prints out s on its own line, n times. If n is negative, print "".
    public static String printStringNTimes(String s, int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.println(s);
        }
        return s;
    }

    //9. Modify the method to print out the string concatenated with itself n times.
    public static String printStringNTimesConcat(String s, int n) {
        for(int i = 1; i <= n; i++)
        {
            System.out.print(s);
        }
        return s;
    }
    //10. Write a method that prints the first ten Fibonnaci numbers.
    public static void firstTenFib(){
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <= 8; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
    //11. Modify the method to sum the first ten Fibonnaci numbers.
    //OMG cant figure this out!! :(

    public static int sumOfFirstTenFib()
    {
        int a = 0;
        int b = 1;
        int c = a + b;
        int sum = 1;

        int i;
        for(i = 0; i <= 8; i++)
        {
            c = a + b;
            a = b;
            b = c;
            sum += i;
            //System.out.println(c);
        }
        return i;
    }
    //12. Modify the method to take in an int n and sum the first n Fibonnaci numbers.
    public static int nthFibonacci(int x) {


        int a = 0;
        int b = 1;
        int c = a+b;
        int i = x;
        //int nthFib = c;

        if (x <= 0) {
            System.out.println("no negative numbers or 0!");
        }
        if (x == 1) {
            System.out.println("0");
        }
        if (x == 2) {
            System.out.println("1");
        }
        else {
            for (i = 3; i <= x; i++){
                c = a + b;
                a = b;
                b = c;

                //System.out.println(c); <- this prints out all of the
                //return c;
                //break;
            }
            System.out.println(c);
        }

        return (c);


    }

}
