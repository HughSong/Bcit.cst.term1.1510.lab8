import java.util.Scanner;
public class DrunkenWalk {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RandomWalk drunk;
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int numfalls=0;
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many drunks do you want: ");
        int numD = scan.nextInt();
        System.out.println("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        System.out.println("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        
        for(int i = 1; i<=numD;i++) {
            
            drunk = new RandomWalk(maxSteps,maxCoord);
            drunk.walk();
            
            //System.out.println(drunk);
            
            if(drunk.inBounds()==false) {
                numfalls++;
            } 
            
            //System.out.println(numfalls);
        }
        System.out.println("In these " + numD + " drunks, " + numfalls + " of them fell into the lake");
        

    }

}
