 /**
 * 
 */
import java.util.Scanner;
/**
 * @author ËÎÓëçñ
 *
 */
public class Comparisons {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1;
        String str2;
        String str3;
        Scanner scan;
        
        Compare3 a;
        Compare3 b;
        Compare3 c;
        
        scan = new Scanner(System.in);
        System.out.print("Please enter your first string: ");
        str1 = scan.nextLine();
        a = new Compare3(str1);
        System.out.print("Please enter your second string: ");
        str2 = scan.nextLine();
        b = new Compare3(str2);
        System.out.print("Please enter your third string: ");
        str3 = scan.nextLine();
        c = new Compare3(str3);
        System.out.println("The largest of the three string is: " + Compare3.largest(a,b,c));
        
        

    }

}
