package assignment1;

import java.util.Scanner;

public class FourthProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Time taken " + duration + " milliseconds");
        int f = factorial(n);
        System.out.println(f);
    }
    /*
     *This method returns factorial of the number that we inputed.
     *Time complexity: 0(n), where n is number that we input.
     *Complexity class: Linear
     *@param n The is number that we input.
     *@return factorial by using recursion
     */
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
