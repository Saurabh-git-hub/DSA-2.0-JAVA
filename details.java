import java.util.*;

public class details {

    public static void main(String[] args) {
        // String firstName = "tony";
        // String SecondName = "Stark";
        // String fullName = firstName + " " + SecondName;
        // // System.out.println("Full Name: " + fullName);
        // System.out.println(fullName.length());

        // for (int i = 0; i< fullName.length(); i++){
        //     System.out.println("Character at index " + i + ": " + fullName.charAt(i));

        // String name1 = "Tony";
        // String name2 = "Stark";

        // if (name1.compareTo(name2) == 0){
        //     System.out.println("both are equal");
        // }
        // else if (name1.compareTo(name2) < 0){
        //     System.out.println(name1 + " comes before " + name2);
        // } else {
        //     System.out.println(name1 + " comes after " + name2);
        // } 

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        for ( int i = 0 ; i <sb.length()/2; i++){
            int front =i;
            int back = sb.length() - i - 1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);


        }
        System.err.println("Reversed String: " + sb);
    }
}