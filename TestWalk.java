
// ************************************************************
// TestWalk.java
//
// Program to test methods in the RandomWalk class.
// ************************************************************
import java.util.Scanner;

public class TestWalk {
    public static void main(String[] args) {
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int x, y; // starting x and y coordinates for a walk
        RandomWalk a;
        RandomWalk b;
        int maxStepsA = 200;
        int maxCoordA = 10;
        a = new RandomWalk(maxStepsA,maxCoordA);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        System.out.println("First walker: ");
        System.out.print("Bounary: 10\t");
        System.out.println("Maximum number of steps: 200");
        System.out.println();
        System.out.println("Second walker: ");
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the starting x and y coordinates with " + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();
        b = new RandomWalk(maxSteps,maxCoord,x,y);
        
        for(int i=0;i<5;i++) {
            a.takeStep();
            b.takeStep();
            System.out.println(b);
            System.out.println(b.getMaxDistance());
        }
        a.walk();
        
        b.getMaxDistance();
        System.out.println("First walker: " + a);
        System.out.println(a.getMaxDistance());
        System.out.println("Second walker: " + b);
        System.out.println(b.getMaxDistance());
    }
}