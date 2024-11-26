package Assignment;

import java.util.function.Predicate;

public class StringCheck {

    public static void main(String[] args) {

        String s1="Siddharth";
        
        Predicate<String> p=(s)->s.contains("ar");
        boolean result=p.test(s1);
        System.out.println(result);
        
    }
    
}
