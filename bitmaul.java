import java.util.*;
public class bitmaul {

    public static void main(String[] args) {
        
        int n = 5;
        int m = 3;
        int bitMask = 1 << m;

        if ((n & bitMask) == 0) {
            System.out.println("Bit is OFF");
        } else {
            System.out.println("Bit is ON");
        }


    }

    
}
