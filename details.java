import java.util.*;

import javax.print.DocFlavor.STRING;

public class details {

    public static void main(String[] args) {
        String firstName = "tony";
        String SecondName = "Stark";
        String fullName = firstName + " " + SecondName;
        // System.out.println("Full Name: " + fullName);
        System.out.println(fullName.length());

        for (int i = 0; i< fullName.length(); i++){
            System.out.println("Character at index " + i + ": " + fullName.charAt(i));
        } 

    }
}