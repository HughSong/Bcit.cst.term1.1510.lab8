/**
 * 
 */
import java.util.Random;
/**
 * @author ËÎÓëçñ
 *
 */
public class RandomWalk {

    private int currentPosiX;
    private int currentPosiY;
    private int max;
    private int numSteps;
    private int edge;
    private int maxDistance;

    public RandomWalk (int max, int edge) {
        this.max = max;
        this.edge = edge;
        currentPosiX = 0;
        currentPosiY = 0;
        numSteps = 0;
        maxDistance = 0;
    }
    
    public RandomWalk (int max, int edge,int startX, int startY) {
        this.max = max;
        this.edge = edge;
        currentPosiX = startX;
        currentPosiY = startY;
        numSteps = 0;
        maxDistance = 0;
    }
    
    public void takeStep() {
        int direction;
        Random generator = new Random();
        direction = generator.nextInt(4);
        
        switch(direction){
        case 0:
            currentPosiY++;
            break;
        case 1:
            currentPosiY--;
            break;
        case 2:
            currentPosiX++;
            break;
        case 3:
            currentPosiX--;
            break;
        }
        numSteps++;
        maxDistance = max(currentPosiX,currentPosiY);
    }
    
    public boolean moreSteps(){
         return numSteps<max;
    }
    
    public boolean inBounds() {
        return Math.abs(currentPosiX)<edge && Math.abs(currentPosiY)<edge;
    }
    
    public void walk() {
        while(inBounds()==true && moreSteps()==true) {
            takeStep();
        }
    }
    
    public int getX(){
        return currentPosiX;
    }
    
    public int getY(){
        return currentPosiY;
    }
    
    private int max(int num1,int num2) {
        if (Math.abs(num1)>maxDistance || Math.abs(num2)>maxDistance) {
        if(Math.abs(num1)>Math.abs(num2)) {
            return Math.abs(num1);
        }
        else if(Math.abs(num1)<Math.abs(num2)) {
            return Math.abs(num2);
        }
        else{
            return Math.abs(num1);
        }
        }
        else {
            return maxDistance;
        }
        }
    
    
    public int getMaxDistance(){
        return maxDistance;
    }
    public String toString() {
        return "Step: " + numSteps + "; Postion: " + "(" + currentPosiX + "," + currentPosiY + ")";
    }
    
    }

