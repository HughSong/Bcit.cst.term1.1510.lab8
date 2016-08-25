
public class Collisions {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int maxSteps = 2000000; // maximum number of steps in a walk
        int maxCoord = 100000; // the maximum x and y coordinate
        int xA = -3;
        int yA = 0;
        int xB = 3;
        int yB = 0;
        int collide = 0;
        RandomWalk a;
        RandomWalk b;
        System.out.println("The boundary is: 2000000");
        System.out.println("The maximum number of steps is: 100000000");
        System.out.println("The start point of particle a is (-3,0)");
        System.out.println("The start point of particle b is (3,0)");
        a = new RandomWalk(100000,2000000,-3,0);
        
        b = new RandomWalk(100000,2000000,3,0);
        
        System.out.println("----------------------");
        
        for(int i = 1; i<=maxSteps; i++) {
            if (Collisions.samePosition(a,b)) {
                collide++;
                System.out.println("At the position(" + a.getX() + "," + a.getY() + "), these two particles cllide.");
            }
        }
        System.out.println("These two particles cllide " + collide + " times.");
    }
    
    public static boolean samePosition (RandomWalk p1, RandomWalk p2) {
        p1.takeStep();
        p2.takeStep();
        return p1.getX()==p2.getX() && p1.getY()==p2.getY();
    }

}
