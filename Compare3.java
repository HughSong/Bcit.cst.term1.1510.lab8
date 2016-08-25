
public class Compare3 implements Comparable<Compare3> {
    
    
    private String str;
    
    public Compare3(String str){
        this.str = str;
    }
    
    public int compareTo(Compare3 o) {
        if (this.str.compareTo(o.str) > 0) {
            return 1;
        }
        else if (this.str.compareTo(o.str) < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
    
    /*public String getString() {
        return str;
    }*/
    
    public static Compare3 largest(Compare3 str1, Compare3 str2, Compare3 str3) {
        if(str1.compareTo(str2)>0 && str1.compareTo(str3)>0) {
            return str1;
        }
            else if ((str2.compareTo(str1)>0 && str2.compareTo(str3)>0)) {
                return str2;
        }
            else if ((str3.compareTo(str2)>0 && str3.compareTo(str1)>0)) {
                return str3;
        }
            else {
                System.out.println("They are equal.");
                return null;
            }
    }


    public String toString() {
        return str;
    }

}
