package Assignment;

import java.util.Scanner;

interface StringLength{
    int length(String str);
}
public class Length {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String t=sc.next();
        
        StringLength s1=(str)->{

            return str.length();
           
        };

        System.out.println(s1.length(t));

    }
    
}
